package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8mz  reason: invalid class name */
public final class AnonymousClass8mz extends C60192nY {
    public final AnonymousClass11S A00;
    public final C20606ARq A01;
    public final C26371Rw A02;
    public final AnonymousClass1S4 A03;
    public final C25161Nd A04;
    public final AnonymousClass1Q0 A05;
    public final AnonymousClass11P A06;
    public final C19830z4 A07;
    public final AnonymousClass1LW A08;
    public final AnonymousClass1CJ A09;

    public /* bridge */ /* synthetic */ C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        String[] strArr = a6u.A06;
        C62382rJ r3 = a6u.A01;
        C166378cn r2 = a6u.A03;
        if (strArr.length != 1 || !AnonymousClass8BU.A1a("setting_unarchiveChats", strArr) || !C62382rJ.A03.equals(r3) || r2 == null || !AnonymousClass8BW.A1Q(r2.bitField0_) || (r2.bitField0_ & 262144) == 0) {
            return null;
        }
        long j = r2.timestamp_;
        C19999A2n a2n = a6u.A02;
        AnonymousClass8YP r0 = r2.unarchiveChatsSetting_;
        if (r0 == null) {
            r0 = AnonymousClass8YP.DEFAULT_INSTANCE;
        }
        return new AnonymousClass8q7(a2n, str, j, r0.unarchiveChats_);
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A07(a8l);
    }

    public boolean A0J() {
        return true;
    }

    private final void A00(AnonymousClass1BI r4, boolean z) {
        C29691ci A0A = this.A09.A0A(r4);
        if (A0A != null && A0A.A0l != z) {
            C17900vP.A0n("UnarchiveChatsSettingsHAndler/setArchive -", AnonymousClass000.A10(), z);
            A0A.A0l = z;
            this.A08.A0J(A0A, true);
        }
    }

    public List A0F(boolean z) {
        C19830z4 r1 = this.A07;
        if (!r1.A2Q() || this.A00.A0N()) {
            Log.i("unarchive-chats-setting-handler/createBootstrapMutations/empty");
            return C18460wS.A00;
        }
        Log.i("unarchive-chats-setting-handler/createBootstrapMutations");
        if (z) {
            return A0K();
        }
        return C18070vi.A0M(new AnonymousClass8q7((C19999A2n) null, (String) null, AnonymousClass11P.A01(this.A06), r1.A2R()));
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        AnonymousClass8q7 r7 = (AnonymousClass8q7) a8l;
        C18070vi.A0d(r7, 0);
        if (this.A00.A0N()) {
            if (r7.A05 == C62382rJ.A03) {
                C19830z4 r3 = this.A07;
                if (!r3.A2Q()) {
                    AnonymousClass1Q0 r1 = this.A05;
                    C17960vV.A0D(r1.A00.A0N());
                    C17880vN.A1F(C19830z4.A00(r1.A02), "archive_v2_enabled", true);
                }
                boolean z = r7.A00;
                C17880vN.A1F(C19830z4.A00(r3), "notify_new_message_for_archived_chats", z);
                if (z) {
                    ArrayList A0B = this.A00.A0B();
                    ArrayList A0D = C29351c6.A0D(A0B);
                    Iterator it = A0B.iterator();
                    while (it.hasNext()) {
                        A0D.add(C196629vN.A00((AnonymousClass8q2) it.next()));
                    }
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it2 = A0D.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((AnonymousClass8q1) ((C195559tX) next).A00).A00) {
                            A13.add(next);
                        }
                    }
                    Iterator it3 = A13.iterator();
                    while (it3.hasNext()) {
                        C195559tX r32 = (C195559tX) it3.next();
                        C20606ARq aRq = this.A01;
                        AnonymousClass1BI r2 = r32.A02;
                        int A002 = A7L.A00(aRq.A02(r2, false), r32.A01);
                        if (A002 == 0 || !(A002 == 1 || A002 == 2)) {
                            Log.i("UnarchiveChatsSettingHandler/handleSettingOn/setArchivedState - false");
                            A00(r2, false);
                        }
                    }
                } else {
                    ArrayList A032 = C26331Rs.A03(this.A00, "archive", false);
                    ArrayList A0D2 = C29351c6.A0D(A032);
                    Iterator it4 = A032.iterator();
                    while (it4.hasNext()) {
                        A0D2.add(C196629vN.A00((AnonymousClass8q2) it4.next()));
                    }
                    ArrayList A132 = AnonymousClass000.A13();
                    Iterator it5 = A0D2.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        if (((AnonymousClass8q1) ((C195559tX) next2).A00).A00) {
                            A132.add(next2);
                        }
                    }
                    Iterator it6 = A132.iterator();
                    while (it6.hasNext()) {
                        Log.i("UnarchiveChatsSettingHandler/handleSettingOff/setArchivedState - true");
                        A00(((C195559tX) it6.next()).A02, true);
                    }
                }
            } else {
                return;
            }
        }
        A09(r7);
    }

    public final List A0K() {
        if (this.A00.A0N()) {
            C17960vV.A0F(false, "unarchive-chats-setting-handler/Companion should not create Unarchive Chats Setting mutation");
            return C18460wS.A00;
        }
        ArrayList A0w = AnonymousClass8BU.A0w("unarchive-chats-setting-handler/onUnarchiveChatsSettingChanged");
        HashSet A12 = AnonymousClass8BR.A12(this.A04.A07());
        ArrayList A0B = this.A00.A0B();
        ArrayList A0D = C29351c6.A0D(A0B);
        Iterator it = A0B.iterator();
        while (it.hasNext()) {
            A0D.add(C196629vN.A00((AnonymousClass8q2) it.next()));
        }
        C19830z4 r3 = this.A07;
        boolean A2R = r3.A2R();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = A0D.iterator();
        if (A2R) {
            while (it2.hasNext()) {
                Object next = it2.next();
                if (A12.contains(((C195559tX) next).A02)) {
                    A13.add(next);
                }
            }
            Iterator it3 = A13.iterator();
            while (it3.hasNext()) {
                this.A02.A08(1);
                AnonymousClass1BI r9 = ((C195559tX) it3.next()).A02;
                AnonymousClass11P r5 = this.A06;
                A0w.add(new C170468pu(r9, AnonymousClass11P.A01(r5), false));
                A0w.add(new AnonymousClass8q1(this.A01.A02(r9, false), r9, AnonymousClass11P.A01(r5), true));
            }
        } else {
            while (it2.hasNext()) {
                Object next2 = it2.next();
                AnonymousClass3MZ.A1V(next2, A13, A12.contains(((C195559tX) next2).A02) ? 1 : 0);
            }
            Iterator it4 = A13.iterator();
            while (it4.hasNext()) {
                AnonymousClass1BI r10 = ((C195559tX) it4.next()).A02;
                A0w.add(new AnonymousClass8q1(this.A01.A02(r10, false), r10, AnonymousClass11P.A01(this.A06), false));
            }
        }
        ArrayList A10 = C17880vN.A10(A0w);
        A10.add(new AnonymousClass8q7((C19999A2n) null, (String) null, AnonymousClass11P.A01(this.A06), r3.A2R()));
        return A10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8mz(AnonymousClass11S r2, C20606ARq aRq, C26371Rw r4, AnonymousClass1S4 r5, C25161Nd r6, AnonymousClass1Q0 r7, AnonymousClass11P r8, C19830z4 r9, AnonymousClass1LW r10, AnonymousClass1CJ r11, C26331Rs r12) {
        super(r12);
        C18070vi.A0w(r8, r10, r2, r11, r7);
        C18070vi.A0x(aRq, r4, r5, r9, r6);
        C18070vi.A0d(r12, 11);
        this.A06 = r8;
        this.A08 = r10;
        this.A00 = r2;
        this.A09 = r11;
        this.A05 = r7;
        this.A01 = aRq;
        this.A02 = r4;
        this.A03 = r5;
        this.A07 = r9;
        this.A04 = r6;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "setting_unarchiveChats";
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8BU.A1B(this, a8l);
    }
}
