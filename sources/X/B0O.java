package X;

import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

public final class B0O extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NotificationsAndSoundsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0O(NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        super(1);
        this.this$0 = notificationsAndSoundsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 r7 = (AnonymousClass1D6) obj;
        Object obj2 = r7.first;
        String[] strArr = new String[2];
        strArr[0] = "jid_message_tone";
        if (C18070vi.A0O("jid_call_ringtone", strArr, 1).contains(obj2)) {
            NotificationsAndSoundsFragment.A02(this.this$0, (String) r7.second, (String) r7.first);
        } else if (C18070vi.A0M("jid_message_activity_level").contains(obj2)) {
            NotificationsAndSoundsFragment.A01(AnonymousClass2UH.A00(C108955ca.A0l((String) r7.second)), this.this$0);
        } else {
            String[] strArr2 = new String[2];
            strArr2[0] = "jid_message_vibration";
            if (C18070vi.A0O("jid_call_vibration", strArr2, 1).contains(obj2)) {
                NotificationsAndSoundsFragment.A03(this.this$0, (String) r7.second, (String) r7.first);
            }
        }
        return C27621Wu.A00;
    }
}
