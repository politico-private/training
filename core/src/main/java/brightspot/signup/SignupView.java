package brightspot.core.signup;

import com.psddev.cms.view.ViewInterface;
import com.psddev.cms.view.ViewTemplate;
import com.psddev.handlebars.HandlebarsTemplate;
import com.psddev.styleguide.PreviewPageViewMainField;
import com.psddev.styleguide.core.container.FourColumnContainerViewColumnFourField;
import com.psddev.styleguide.core.container.FourColumnContainerViewColumnOneField;
import com.psddev.styleguide.core.container.FourColumnContainerViewColumnThreeField;
import com.psddev.styleguide.core.container.FourColumnContainerViewColumnTwoField;
import com.psddev.styleguide.core.container.OneColumnContainerViewColumnOneField;
import com.psddev.styleguide.core.container.ThreeColumnContainerViewColumnOneField;
import com.psddev.styleguide.core.container.ThreeColumnContainerViewColumnThreeField;
import com.psddev.styleguide.core.container.ThreeColumnContainerViewColumnTwoField;
import com.psddev.styleguide.core.container.TwoColumnContainerViewColumnOneField;
import com.psddev.styleguide.core.container.TwoColumnContainerViewColumnTwoField;
import com.psddev.styleguide.core.enhancement.EnhancementViewItemField;
import com.psddev.styleguide.core.footer.FooterColumnViewItemsField;
import com.psddev.styleguide.core.gallery.GalleryPageViewEndCardField;
import com.psddev.styleguide.core.list.ListViewItemsField;
import com.psddev.styleguide.core.module.ModuleTypeViewContentField;
import com.psddev.styleguide.core.page.PageViewAboveField;
import com.psddev.styleguide.core.page.PageViewAsideField;
import com.psddev.styleguide.core.page.PageViewBelowField;
import com.psddev.styleguide.core.page.PageViewFooterContentField;
import com.psddev.styleguide.core.page.PageViewMainField;
import com.psddev.styleguide.core.tab.TabItemViewContentField;
import com.psddev.styleguide.corporate.syndication.SyndicatedPageViewFooterContentField;
import com.psddev.styleguide.corporate.taxonomy.TaxonomyPageViewTaxonomyContentField;
import com.psddev.styleguide.media.FranchisePageViewContentsField;
import com.psddev.styleguide.media.SeasonPageViewContentsField;
import com.psddev.styleguide.media.ShowPageViewContentsField;
import java.util.ArrayList;
import java.util.Collection;

@ViewInterface
@ViewTemplate("/signup/Signup.hbs")
@HandlebarsTemplate("signup/Signup")
public interface SignupView extends EnhancementViewItemField,
        FooterColumnViewItemsField,
        FourColumnContainerViewColumnFourField,
        FourColumnContainerViewColumnOneField,
        FourColumnContainerViewColumnThreeField,
        FourColumnContainerViewColumnTwoField,
        FranchisePageViewContentsField,
        GalleryPageViewEndCardField,
        ListViewItemsField,
        ModuleTypeViewContentField,
        OneColumnContainerViewColumnOneField,
        PageViewAboveField,
        PageViewAsideField,
        PageViewBelowField,
        PageViewFooterContentField,
        PageViewMainField,
        PreviewPageViewMainField,
        SeasonPageViewContentsField,
        ShowPageViewContentsField,
        SyndicatedPageViewFooterContentField,
        TabItemViewContentField,
        TaxonomyPageViewTaxonomyContentField,
        ThreeColumnContainerViewColumnOneField,
        ThreeColumnContainerViewColumnThreeField,
        ThreeColumnContainerViewColumnTwoField,
        TwoColumnContainerViewColumnOneField,
        TwoColumnContainerViewColumnTwoField {

    CharSequence getLabel();

    Iterable<? extends SignupViewImageField> getImage();

    CharSequence getDek();

    class Builder {

        private CharSequence label;
        private Collection<SignupViewImageField> image;
        private CharSequence dek;

        public Builder() {
        }

        public Builder label(CharSequence label) {
            this.label = label;
            return this;
        }

        public Builder image(Iterable<? extends SignupViewImageField> image) {
            if (image != null) {
                this.image = new ArrayList<>();
                image.forEach(this.image::add);
            } else  {
                this.image = null;
            }
            return this;
        }

        public Builder addToImage(SignupViewImageField image) {
            if (this.image == null) {
                this.image = new ArrayList<>();
            }
            this.image.add(image);
            return this;
        }

        public Builder addAllToImage(Iterable<? extends SignupViewImageField> image) {
            if (this.image == null) {
                this.image = new ArrayList<>();
            }
            image.forEach(this.image::add);
            return this;
        }

        public Builder dek(CharSequence dek) {
            this.dek = dek;
            return this;
        }

        public SignupView build() {
            return new SignupView() {
                @Override
                public CharSequence getLabel() {
                    return label;
                }

                @Override
                public Iterable<? extends SignupViewImageField> getImage() {
                    return image;
                }

                @Override
                public CharSequence getDek() {
                    return dek;
                }
            };
        }
    }
}
