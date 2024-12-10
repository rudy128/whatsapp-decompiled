package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6M8  reason: invalid class name */
public final class AnonymousClass6M8 extends A34 {
    public int A00;
    public final WfalManager A01;
    public final AnonymousClass1TG A02;
    public final C24631Lb A03;
    public final C24661Le A04;
    public final C25931Qe A05;
    public final UserJid A06;
    public final AnonymousClass205 A07;
    public final AnonymousClass1W6 A08;
    public final C30141dS A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6M8(WfalManager wfalManager, AnonymousClass1TG r4, C24631Lb r5, C24661Le r6, C25931Qe r7, UserJid userJid, AnonymousClass205 r9, StatusPlaybackContactFragment statusPlaybackContactFragment, AnonymousClass1W6 r11, C30141dS r12, AnonymousClass00H r13, AnonymousClass00H r14, boolean z, boolean z2) {
        super(statusPlaybackContactFragment, true);
        C72473Md.A1M(r12, r11, wfalManager, 3);
        this.A04 = r6;
        this.A09 = r12;
        this.A08 = r11;
        this.A01 = wfalManager;
        this.A02 = r4;
        this.A03 = r5;
        this.A0A = r13;
        this.A0B = r14;
        this.A05 = r7;
        this.A07 = r9;
        this.A0C = z;
        this.A06 = userJid;
        this.A0D = z2;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        C24661Le r0 = this.A04;
        UserJid userJid = this.A06;
        C63372sx A082 = r0.A08(userJid);
        ArrayList A042 = this.A02.A04(userJid, -1);
        C18070vi.A0z(A042, "null cannot be cast to non-null type kotlin.collections.MutableList<@[EnhancedNullability] com.whatsapp.protocol.FMessage>");
        List A012 = C41681wt.A01(A042);
        if (userJid == AnonymousClass1E5.A00) {
            if (WfalManager.A00(this.A01, false)) {
                AnonymousClass738.A02((AnonymousClass738) this.A0A.get());
            } else if (this.A09.A00()) {
                C62422rN.A00((C62422rN) this.A0B.get());
            }
        }
        if (A082 != null) {
            AnonymousClass205 r1 = this.A07;
            int i2 = 0;
            if (r1 != null) {
                AnonymousClass1W6 r02 = this.A08;
                C18070vi.A0d(r02, 0);
                AnonymousClass206 A0s = C108945cZ.A0s(r1, r02);
                if (A0s != null) {
                    i = this.A00;
                    if (!(A012 instanceof Collection) || !A012.isEmpty()) {
                        Iterator it = A012.iterator();
                        while (it.hasNext()) {
                            if (C17880vN.A0Y(it).A0I < A0s.A0I && (i2 = i2 + 1) < 0) {
                                AnonymousClass1ZU.A0A();
                                throw null;
                            }
                        }
                    }
                    this.A00 = i + i2;
                }
            } else if (this.A0C) {
                if (!this.A0D || C22971Dz.A0b(userJid)) {
                    i = this.A00;
                    if (!(A012 instanceof Collection) || !A012.isEmpty()) {
                        Iterator it2 = A012.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            if (C20133A8t.A0C(C17880vN.A0Y(it2), A082.A05(), false) && (i3 = i3 + 1) < 0) {
                                AnonymousClass1ZU.A0A();
                                throw null;
                            }
                        }
                        i2 = i3;
                    }
                    this.A00 = i + i2;
                } else {
                    Iterator it3 = A012.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (!(!C20133A8t.A0C(C17880vN.A0Y(it3), Long.MIN_VALUE, true))) {
                            i4++;
                        } else if (i4 != -1) {
                            i2 = i4;
                        }
                    }
                    this.A00 = i2;
                }
            }
            HashMap A11 = C17880vN.A11();
            if (C22971Dz.A0Z(userJid)) {
                Iterator it4 = A012.iterator();
                while (it4.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it4);
                    A11.put(Long.valueOf(A0Y.A0x), this.A03.A00(A0Y));
                }
            }
            Iterator it5 = A012.iterator();
            while (it5.hasNext()) {
                AnonymousClass206 A0Y2 = C17880vN.A0Y(it5);
                if (A0Y2.A0u == 2) {
                    this.A05.A05(A0Y2);
                }
            }
            return C108945cZ.A0N(A012, A11);
        }
        return C108945cZ.A0N(AnonymousClass000.A13(), AnonymousClass1D7.A0I());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.206} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.206} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.206} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.206} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r12) {
        /*
            r11 = this;
            android.util.Pair r12 = (android.util.Pair) r12
            r2 = 0
            X.C18070vi.A0d(r12, r2)
            java.lang.Class<com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment> r0 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.class
            X.1F9 r3 = r11.A0A(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r3
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r7 = r12.first
            X.C18070vi.A0W(r7)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r12.second
            X.C18070vi.A0W(r5)
            java.util.Map r5 = (java.util.Map) r5
            int r8 = r11.A00
            boolean r10 = X.C18070vi.A17(r7, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "playbackFragment/onMessagesLoaded "
            X.C17890vO.A15(r0, r1, r7)
            java.lang.String r0 = " messages; "
            X.C17900vP.A0Y(r3, r0, r1)
            X.6kV r4 = r3.A05
            r3.A0w = r7
            r3.A0x = r5
            int r1 = r3.A01
            r0 = 9
            if (r1 != r0) goto L_0x00af
            X.1Lc r0 = r3.A2C()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00af
            android.os.Bundle r1 = r3.A15()
            java.lang.String r0 = ""
            X.205 r9 = X.AnonymousClass4aU.A03(r1, r0)
            if (r9 == 0) goto L_0x00af
            java.util.List r0 = r3.A0w
            r6 = 0
            if (r0 == 0) goto L_0x00af
            java.util.Iterator r5 = r0.iterator()
        L_0x005d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r0 = r0.A0v
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 == 0) goto L_0x005d
            r6 = r1
        L_0x0073:
            X.206 r6 = (X.AnonymousClass206) r6
            if (r6 == 0) goto L_0x00af
            X.206[] r0 = new X.AnonymousClass206[r10]
            r0[r2] = r6
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A06(r0)
            r3.A0w = r0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A09(r3)
            r3.A00 = r2
            X.70K r0 = r3.A2G(r6)
            if (r4 == 0) goto L_0x0096
            android.view.ViewGroup r1 = r4.A07
            r1.removeAllViews()
            android.view.View r0 = r0.A00
            r1.addView(r0)
        L_0x0096:
            java.util.List r0 = r3.A0w
            if (r0 == 0) goto L_0x00a5
            int r1 = r3.A00
            r0 = -1
            r3.A00 = r0
            if (r1 != r0) goto L_0x00a2
            r1 = 0
        L_0x00a2:
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0A(r3, r1)
        L_0x00a5:
            X.70K r1 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A01(r3)
            int r0 = r3.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0B(r3, r1, r2, r0)
        L_0x00ae:
            return
        L_0x00af:
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A09(r3)
            boolean r0 = X.AnonymousClass000.A1a(r7)
            if (r0 == 0) goto L_0x00db
            int r0 = r7.size()
            if (r8 >= r0) goto L_0x00c0
            r3.A00 = r8
        L_0x00c0:
            int r0 = r3.A00
            X.206 r0 = X.AnonymousClass3MW.A0k(r7, r0)
            X.70K r0 = r3.A2G(r0)
            if (r4 == 0) goto L_0x00d6
            android.view.ViewGroup r1 = r4.A07
            r1.removeAllViews()
            android.view.View r0 = r0.A00
            r1.addView(r0)
        L_0x00d6:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x00ae
            goto L_0x0096
        L_0x00db:
            X.1FL r1 = r3.A1B()
            X.89M r1 = (X.AnonymousClass89M) r1
            com.whatsapp.jid.UserJid r0 = r3.A0N
            if (r0 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = r0.getRawString()
            com.whatsapp.status.playback.StatusPlaybackActivity r1 = (com.whatsapp.status.playback.StatusPlaybackActivity) r1
            X.C18070vi.A0d(r0, r2)
            com.whatsapp.status.playback.StatusPlaybackActivity.A0r(r1, r0, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M8.A0H(java.lang.Object):void");
    }
}
