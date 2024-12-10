package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1sX  reason: invalid class name and case insensitive filesystem */
public abstract class C39131sX extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C39131sX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            wDSProfilePhoto.A01 = (C18030ve) r1.A04.get();
            wDSProfilePhoto.setWhatsAppLocale((C18000vb) r1.ABz.get());
        }
    }
}
