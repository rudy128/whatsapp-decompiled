package X;

import android.content.Context;
import android.graphics.PorterDuffXfermode;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3Dj  reason: invalid class name */
public class AnonymousClass3Dj implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass3Dj(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final Object invoke() {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A02;
            PorterDuffXfermode porterDuffXfermode = C43081zE.A0S;
            C18000vb whatsAppLocale = wDSProfilePhoto.getWhatsAppLocale();
            C18030ve abProps = wDSProfilePhoto.getAbProps();
            C39191sf r9 = wDSProfilePhoto.A03;
            C39201sg r8 = wDSProfilePhoto.A02;
            boolean z = wDSProfilePhoto.A05;
            C39241sk r1 = wDSProfilePhoto.A04;
            C18070vi.A0g(r9, 4, r8);
            return new C43081zE(context, whatsAppLocale, abProps, new C43101zG(context, whatsAppLocale, wDSProfilePhoto, r8, r9, r1), r8, r9, z);
        }
        Class cls = (Class) this.A02;
        return new AnonymousClass25F((AnonymousClass206) this.A01, cls, AnonymousClass25D.class.isAssignableFrom(cls));
    }
}
