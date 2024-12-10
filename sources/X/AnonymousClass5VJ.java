package X;

import com.whatsapp.community.CommunityMembersViewModel;
import java.util.Map;

/* renamed from: X.5VJ  reason: invalid class name */
public final class AnonymousClass5VJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Map $directory;
    public final /* synthetic */ boolean $isPhotoUpdate;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VJ(CommunityMembersViewModel communityMembersViewModel, Map map, boolean z) {
        super(1);
        this.$directory = map;
        this.this$0 = communityMembersViewModel;
        this.$isPhotoUpdate = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (java.lang.Integer.valueOf(r10) != null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            X.4SF r13 = (X.AnonymousClass4SF) r13
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.util.Map r0 = r12.$directory
            com.whatsapp.jid.PhoneUserJid r7 = r13.A03
            java.lang.Object r3 = r0.get(r7)
            X.2sr r3 = (X.C63312sr) r3
            r8 = 0
            if (r3 == 0) goto L_0x0065
            com.whatsapp.community.CommunityMembersViewModel r1 = r12.this$0
            boolean r2 = r12.$isPhotoUpdate
            X.1M9 r0 = r1.A0B
            X.1E7 r6 = r0.A0E(r7)
            X.11S r0 = r1.A07
            com.whatsapp.jid.UserJid r5 = r3.A04
            boolean r0 = r0.A0O(r5)
            if (r0 == 0) goto L_0x0060
            X.2n7 r0 = r1.A06
            java.lang.String r8 = r0.A00()
        L_0x002d:
            X.1gd r4 = r1.A08
            X.1EC r0 = r1.A0I
            com.whatsapp.community.CommunityMembersDirectory r4 = (com.whatsapp.community.CommunityMembersDirectory) r4
            X.1EC r1 = com.whatsapp.community.CommunityMembersDirectory.A00(r4, r0)
            if (r1 == 0) goto L_0x005e
            X.1MZ r0 = r4.A06
            X.1MW r0 = r0.A08
            X.2tp r1 = r0.A0B(r1)
            r0 = 0
            X.2sr r0 = r1.A0D(r5, r0)
            if (r0 == 0) goto L_0x005e
            int r10 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            if (r0 == 0) goto L_0x005e
        L_0x0050:
            int r9 = r3.A01
            int r11 = r13.A01
            if (r2 == 0) goto L_0x0058
            int r11 = r11 + 1
        L_0x0058:
            X.4SF r5 = new X.4SF
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x005e:
            r10 = -1
            goto L_0x0050
        L_0x0060:
            if (r6 == 0) goto L_0x002d
            java.lang.String r8 = r6.A0Z
            goto L_0x002d
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VJ.invoke(java.lang.Object):java.lang.Object");
    }
}
