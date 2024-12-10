package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8n2  reason: invalid class name */
public final class AnonymousClass8n2 extends C60192nY {
    public final AnonymousClass1S4 A00;
    public final AnonymousClass1CJ A01;
    public final C26331Rs A02;
    public final C20606ARq A03;
    public final C26371Rw A04;
    public final C25161Nd A05;
    public final AnonymousClass11P A06;
    public final C19830z4 A07;
    public final AnonymousClass1LW A08;
    public final AnonymousClass1Nb A09;

    public /* bridge */ /* synthetic */ C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        C166378cn r4 = a6u.A03;
        if (!A03(a6u)) {
            return null;
        }
        C22931Dv r1 = AnonymousClass1BI.A00;
        String[] strArr = a6u.A06;
        AnonymousClass1BI A022 = r1.A02(strArr[1]);
        if (A022 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("archive-chat-mutation/from-key-value unable to create chat jid from ");
            C17890vO.A19(A10, strArr[1]);
            return null;
        } else if (r4 == null || !A03(a6u)) {
            return null;
        } else {
            AnonymousClass8ZV r2 = r4.archiveChatAction_;
            if (r2 == null) {
                r2 = AnonymousClass8ZV.DEFAULT_INSTANCE;
            }
            boolean A1O = AnonymousClass000.A1O(r2.bitField0_ & 2);
            C165018aS r0 = r2.messageRange_;
            if (r0 == null) {
                r0 = C165018aS.DEFAULT_INSTANCE;
            }
            A7L A023 = A7L.A02(r0, A1O);
            boolean z2 = r2.archived_;
            return new AnonymousClass8q1(a6u.A02, A023, A022, str, r4.timestamp_, z2, z);
        }
    }

    public boolean A0J() {
        return true;
    }

    public final AnonymousClass8q1 A0K(AnonymousClass1BI r7, boolean z) {
        C18070vi.A0d(r7, 0);
        long A012 = AnonymousClass11P.A01(this.A06);
        return new AnonymousClass8q1(this.A03.A02(r7, false), r7, A012, z);
    }

    private final void A00(C195559tX r6) {
        StringBuilder A10;
        String str;
        AnonymousClass1BI r4 = r6.A02;
        if (!A02(r6, r4) && (r6.A06 || !A02(r6, r6.A03))) {
            C29691ci A0A = this.A01.A0A(r4);
            if (A0A != null) {
                boolean z = ((AnonymousClass8q1) r6.A00).A00;
                if (!z) {
                    A10 = AnonymousClass000.A10();
                    str = "ArchiveChatHandler/applyMutation/setArchivedState - ";
                } else {
                    int A002 = A7L.A00(this.A03.A02(r4, false), r6.A01);
                    if (A002 == 0 || !(A002 == 1 || A002 == 2)) {
                        C19830z4 r1 = this.A07;
                        if (r1.A2Q() && !r1.A2R()) {
                            A10 = AnonymousClass000.A10();
                            str = "ArchiveChatHandler/applyMutation/A_ENCLOSES_B/setArchivedState - ";
                        }
                    } else {
                        C17900vP.A0n("ArchiveChatHandler/applyMutation/B_ENCLOSES_A/setArchivedState - ", AnonymousClass000.A10(), z);
                        A01(r6, A0A);
                    }
                }
                C17900vP.A0n(str, A10, z);
                A01(r6, A0A);
            }
            A0A(r6.A00);
            return;
        }
        A09(r6.A00);
    }

    private final void A01(C195559tX r8, C29691ci r9) {
        boolean z = r9.A0l;
        AnonymousClass8q2 r6 = r8.A00;
        boolean z2 = ((AnonymousClass8q1) r6).A00;
        if (z != z2) {
            C17900vP.A0n("ArchiveChatHandler/setArchive - ", AnonymousClass000.A10(), z2);
            AnonymousClass1BI r5 = r8.A02;
            r9.A0l = z2;
            this.A08.A0J(r9, true);
            if (z2) {
                AnonymousClass1Nb r1 = this.A09;
                if (r1.A0y(r5)) {
                    r1.A0b(r5);
                    this.A04.A08(1);
                    this.A00.A0I(C18070vi.A0P(new C170468pu(r5, r6.A04, false)));
                }
            }
        }
    }

    private final boolean A02(C195559tX r11, AnonymousClass1BI r12) {
        AnonymousClass8q2 r5 = r11.A00;
        if (!((AnonymousClass8q1) r5).A00) {
            return false;
        }
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "pin_v1";
        C17880vN.A1J(r12, A1Z, 1);
        String A002 = AnonymousClass9QR.A00(A1Z);
        C26331Rs r6 = this.A00;
        C20126A8l A0A = r6.A0A(A002);
        if (A0A != null) {
            C166378cn A092 = A0A.A09();
            C17960vV.A07(A092);
            AnonymousClass8YE r0 = A092.pinAction_;
            if (r0 == null) {
                r0 = AnonymousClass8YE.DEFAULT_INSTANCE;
            }
            if (r0.pinned_ && A0A.A04 >= r5.A04) {
                return true;
            }
        }
        C20126A8l A093 = r6.A09(A002);
        if (A093 == null) {
            return false;
        }
        C166378cn A094 = A093.A09();
        C17960vV.A07(A094);
        AnonymousClass8YE r02 = A094.pinAction_;
        if (r02 == null) {
            r02 = AnonymousClass8YE.DEFAULT_INSTANCE;
        }
        if (!r02.pinned_ || A093.A04 < r5.A04) {
            return false;
        }
        return true;
    }

    public static final boolean A03(A6U a6u) {
        C166378cn r3 = a6u.A03;
        if (C18070vi.A18(C62382rJ.A03, a6u.A01)) {
            String[] strArr = a6u.A06;
            if (strArr.length == 2 && AnonymousClass8BU.A1a("archive", strArr) && r3 != null && AnonymousClass8BW.A1Q(r3.bitField0_) && (r3.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                AnonymousClass8ZV r0 = r3.archiveChatAction_;
                if (r0 == null) {
                    r0 = AnonymousClass8ZV.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        AnonymousClass8q2 r2 = (AnonymousClass8q2) a8l;
        C18070vi.A0d(r2, 0);
        A00(C196629vN.A00(r2));
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8q1 r5 = (AnonymousClass8q1) a8l;
        C18070vi.A0d(r5, 0);
        C195559tX A002 = C196629vN.A00(r5);
        C29691ci A0A = this.A01.A0A(A002.A02);
        if (A0A == null) {
            A06(r5);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArchiveChatHandler/handleNotReadyToSyncPendingMutation/setArchivedState - ");
        C17900vP.A0r(A10, r5.A00);
        A01(A002, A0A);
        A08(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        if (r7.A00.A04 <= r6.A00.A04) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0I(X.C20126A8l r19, X.C20126A8l r20) {
        /*
            r18 = this;
            r1 = r20
            r2 = r19
            X.8q2 r2 = (X.AnonymousClass8q2) r2
            X.8q2 r1 = (X.AnonymousClass8q2) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.9tX r6 = X.C196629vN.A00(r2)
            r3 = r18
            if (r1 != 0) goto L_0x001c
            X.1Rs r0 = r3.A02
            X.8q2 r1 = X.C196629vN.A01(r6, r0)
            if (r1 == 0) goto L_0x009b
        L_0x001c:
            X.9tX r7 = X.C196629vN.A00(r1)
            X.A7L r11 = r6.A01
            X.A7L r10 = r7.A01
            int r1 = X.A7L.A00(r11, r10)
            if (r1 == 0) goto L_0x0094
            r0 = 1
            if (r1 == r0) goto L_0x009f
            r0 = 2
            if (r1 == r0) goto L_0x0088
            X.8q2 r8 = r6.A00
            long r4 = r8.A04
            X.8q2 r6 = r7.A00
            long r1 = r6.A04
            int r9 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r0 = r6
            if (r9 < 0) goto L_0x003e
            r0 = r8
        L_0x003e:
            X.8q1 r0 = (X.AnonymousClass8q1) r0
            boolean r0 = r0.A00
            X.1BI r12 = r7.A02
            long r14 = java.lang.Math.max(r4, r1)
            X.A7L r11 = X.A7L.A01(r11, r10)
            r10 = 0
            r17 = 1
            X.8q1 r9 = new X.8q1
            r13 = r10
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r3.A09(r8)
            r3.A06(r6)
            X.1Rs r1 = r3.A00
            java.util.Set r0 = X.C18070vi.A0P(r9)
            r1.A0I(r0)
            X.1CJ r1 = r3.A01
            X.1BI r0 = r9.getChatJid()
            X.1ci r2 = r1.A0A(r0)
            if (r2 == 0) goto L_0x0087
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ArchiveChatHandler/handleMutation/setArchivedState - "
            r1.append(r0)
            boolean r0 = r9.A00
            X.C17900vP.A0r(r1, r0)
            X.9tX r0 = X.C196629vN.A00(r9)
            r3.A01(r0, r2)
        L_0x0087:
            return
        L_0x0088:
            X.8q2 r0 = r7.A00
            long r4 = r0.A04
            X.8q2 r0 = r6.A00
            long r1 = r0.A04
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009f
        L_0x0094:
            X.1Rs r1 = r3.A00
            X.8q2 r0 = r7.A00
            r1.A0G(r0)
        L_0x009b:
            r3.A00(r6)
            return
        L_0x009f:
            X.8q2 r0 = r6.A00
            r3.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8n2.A0I(X.A8l, X.A8l):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8n2(C20606ARq aRq, C26371Rw r2, AnonymousClass1S4 r3, C25161Nd r4, AnonymousClass11P r5, C19830z4 r6, AnonymousClass1LW r7, AnonymousClass1CJ r8, C26331Rs r9, AnonymousClass1Nb r10) {
        super(r9);
        C18070vi.A0w(r5, r7, r8, aRq, r2);
        C18070vi.A0x(r3, r10, r9, r6, r4);
        this.A06 = r5;
        this.A08 = r7;
        this.A01 = r8;
        this.A03 = aRq;
        this.A04 = r2;
        this.A00 = r3;
        this.A09 = r10;
        this.A02 = r9;
        this.A07 = r6;
        this.A05 = r4;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "archive";
    }

    public List A0F(boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A05.A07().iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (A0Q != null) {
                A13.add(new AnonymousClass8q1(this.A03.A02(A0Q, false), A0Q, AnonymousClass11P.A01(this.A06), true));
            } else {
                throw C17880vN.A0g();
            }
        }
        return A13;
    }
}
