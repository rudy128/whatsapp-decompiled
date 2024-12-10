package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

public class AP9 implements C107125Ym {
    public final int A00;
    public final Object A01;

    public AP9(DirectorySetLocationMapActivity directorySetLocationMapActivity, int i) {
        this.A00 = i;
        this.A01 = directorySetLocationMapActivity;
    }

    public final void BxH() {
        if (this.A00 != 0) {
            DirectorySetLocationMapActivity.A0d((DirectorySetLocationMapActivity) this.A01);
        } else {
            DirectorySetLocationMapActivity.A0q((DirectorySetLocationMapActivity) this.A01);
        }
    }
}
