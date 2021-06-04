package brightspot.core.signup;

import brightspot.core.footer.FooterModuleType;
import brightspot.core.image.ImageOption;
import brightspot.core.module.ModuleType;
import com.psddev.dari.db.Recordable;

@Recordable.DisplayName("Signup")
public class SignupModule extends ModuleType implements FooterModuleType {

    @Indexed
    private String label;

    @Indexed
    private String dek;

    private ImageOption image;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDek() {
        return dek;
    }

    public void setDek(String dek) {
        this.dek = dek;
    }

    public ImageOption getImage() {
        return image;
    }

    public void setImage(ImageOption image) {
        this.image = image;
    }
}
