package brightspot.core.signup;

import com.psddev.cms.view.ViewModel;

public class SignupModuleViewModel extends ViewModel<SignupModule> implements SignupView {

    @Override
    public CharSequence getLabel() {
        return model.getLabel();
    }

    @Override
    public Iterable<? extends SignupViewImageField> getImage() {
        return createViews(SignupViewImageField.class, model.getImage());
    }

    @Override
    public CharSequence getDek() {
        return model.getDek();
    }
}
