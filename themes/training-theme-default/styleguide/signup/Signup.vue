<template>
    <div class="sign-up-21 .sign-up-21--initialised" data-api="/spring/cms-api/v1/fpd-21">
        <div class="col sign-up-21--header">
            <div class="sign-up-21--summary">
                <span class="sign-up-21--title" v-if="label">
                    <a href="https://qablue.politico.com/newsletters/huddle" target="_top">{{label}}</a>
                </span>
                <p class="sign-up-21--subtitle" v-if="dek">
                    {{dek}}
                </p>
            </div>
            <div class="sign-up-21--logo">
                <figure class="art">
                    <div class="fig-graphic">
                        <img :src="image" alt="Signup" title="Signup">
                    </div>
                </figure>
            </div>
        </div>
        <div class="js-tealium-newsletter" data-subscription-module="newsletter_inline_standard_Huddle - POLITICO">
            <div class="col col-form">
                <form class="form-section">
                    <input type="hidden" name="subscribeId" value="0000014f-1646-d88f-a1cf-5f46b4be0000">
                    <input type="hidden" name="processorId" value="00000178-cf27-ddf8-a9f8-ffe76a560000">
                    <input type="hidden" name="validateEmail" value="true">
                    <input type="hidden" name="enhancedSignUp" value="true">
                    <input type="hidden" name="bot-field" value="" class="dn">
                    <input type="hidden" name="subscriptionModule" value="newsletter_inline_standard_Huddle - POLITICO" class="dn">
                    <input type="hidden" name="captchaUserToken" value="" autocomplete="off">
                    <input type="hidden" name="captchaPublicKey" value="6LeEKb0UAAAAAPGsqxDRCsYTjeGYDfKfbaVi7DYM" autocomplete="off">

                    <div class="sign-up-21--msg sign-up-21--msg-spinner" ref="loading">
                        <div class="msg-content">
                            <p>Loading</p>
                            <Spinner/>
                        </div>
                    </div>

                    <div class="sign-up-21--msg sign-up-21--msg-completed" aria-live="assertive" tabindex="-1">
                        <div class="msg-content">
                            <p>You will now start receiving email updates</p>
                            <Check/>
                        </div>
                    </div>

                    <div class="sign-up-21--msg sign-up-21--msg-already-subscribed" aria-live="assertive" tabindex="-1">
                        <div class="msg-content">
                            <p style="color:#9E352C">You are already subscribed</p>
                            <Thumb/>
                            <a href="https://qablue.politico.com/newsletters" style="color:#007BC7;text-decoration:none;margin-top:10px;" target="_top" class="js-tealium-tracking" data-tracking="mpos=center&amp;mid=sign_up_21&amp;lindex=2&amp;lcol=0">More Subscriptions</a>
                        </div>
                    </div>

                    <div class="sign-up-21--msg sign-up-21--msg-error" ref="error">
                        <div class="sign-up-21--msg-close" @click="close">
                            <Close/>
                        </div>
                        <div class="msg-content">
                            <p style="color:#9E352C">Something went wrong</p>
                        </div>
                    </div>

                    <fieldset class="form-container active">
                        <div class="form-row row-email">
                            <div class="form-row-container">
                                <label class="data-form-label" for="email" aria-hidden="true">Email</label>
                                <span class="sign-up-21--error-msg"><span class="sign-up-21--exclamation">!</span>Please make sure that the email address you typed in is valid</span>
                                <div class="form-row-container--input">
                                    <PoliticoTextInput type="email" name="subscribeEmail" aria-label="Email" placeholder="Your Email" required=""/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row row-secondary-questions">
                            <div class="sign-up-21--secondary-questions-container"></div>
                            <span class="sign-up-21--notice">
                            <span style="color:red">*</span> All fields must be completed to subscribe.</span>
                        </div>
                        <div class="row-bottom">
                            <p class="form-policy" v-if="policy" v-html="policy"></p>
                            <PoliticoButton type="submit" @click="submit" class="submit-button">Sign Up</PoliticoButton>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
import PoliticoButton from '@politico/vue-components/esm/PoliticoButton'
import PoliticoTextInput from '@politico/vue-components/esm/PoliticoTextInput'
import Check from '../assets/check.svg';
import Close from '../assets/close.svg';
import Spinner from '../assets/spinner.svg';
import Thumb from '../assets/thumb.svg';

export default {
    name: 'Signup',
    components: {
		PoliticoButton,
        PoliticoTextInput,
        Check,
        Close,
        Spinner,
        Thumb,
	},
    props: {
        label: {
            type: String,
        },
        dek: {
            type: String,
        },
        policy: {
            type: String,
        },
        image: {
            type: String,
        }
    },
    data () {
        return {
            email: '',
        };
    },
    methods: {
        close() {
            this.$refs.error.classList.remove('active')
        },
        submit(e) {
            e.preventDefault();

            this.$refs.loading.classList.add('active')

            setTimeout(() => {
                this.$refs.loading.classList.remove('active')
                this.$refs.error.classList.add('active')
            }, 2000)
        }
    }
}
</script>
