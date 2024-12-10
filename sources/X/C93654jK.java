package X;

import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;

/* renamed from: X.4jK  reason: invalid class name and case insensitive filesystem */
public class C93654jK implements C107215Yv {
    public final int A00;
    public final Object A01;

    public C93654jK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C2A(boolean z) {
        if (this.A00 != 0) {
            A99 a99 = (A99) this.A01;
            C17960vV.A02();
            C17900vP.A0Y(a99, "voip/service/proximitylistener.onchanged ", AnonymousClass000.A10());
            if (z) {
                A99.A08(a99);
            } else {
                A99.A07(a99);
            }
        } else {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this.A01;
            C18070vi.A0d(audioChatCallingViewModel, 0);
            AudioChatCallingViewModel.A06(audioChatCallingViewModel, z);
        }
    }
}
