package X;

import android.database.Cursor;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1RV  reason: invalid class name */
public final class AnonymousClass1RV implements AnonymousClass1RU {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06 = new C18110vm(new C71013Dl(this, 4));
    public final C18100vl A07 = new C18110vm(new C71013Dl(this, 0));
    public final C18100vl A08 = new C18110vm(new C71013Dl(this, 3));
    public final C18100vl A09 = new C18110vm(new C71013Dl(this, 2));
    public final C18100vl A0A = new C18110vm(new C71013Dl(this, 5));
    public final C18100vl A0B = new C18110vm(new C71013Dl(this, 1));
    public final AnonymousClass190 A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    public AnonymousClass1RV(AnonymousClass190 r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r10, 8);
        C18070vi.A0d(r11, 9);
        C18070vi.A0d(r12, 10);
        this.A00 = r4;
        this.A0C = r3;
        this.A0D = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A0F = r8;
        this.A01 = r9;
        this.A0E = r10;
        this.A05 = r11;
        this.A04 = r12;
    }

    public final void A00(C28791au r7, AnonymousClass206 r8) {
        C693236t A002 = C60512o9.A00(r8);
        if (A002 != null && ((AbstractCollection) this.A0B.getValue()).contains(A002.A01)) {
            r8.A0S = null;
        }
        C60512o9.A01(r8, (C693236t) null);
        r8.A0c(67108864);
        this.A05.get();
        long j = r8.A0x;
        ((C28801av) r7).A02.A04("message_association", "child_message_row_id = ?", "MessageAssociationStore/DELETE_ALL_MESSAGE_ASSOCIATION_INFO_FOR_CHILDSQL", new String[]{String.valueOf(j)});
        ((AnonymousClass1W6) this.A02.get()).A05(r8, -1);
        AnonymousClass1BI r1 = r8.A0v.A00;
        if (r1 != null) {
            ((AnonymousClass1Q1) this.A0D.get()).A03(r1, false);
        }
    }

    public void BCh(AnonymousClass206 r4, AnonymousClass206 r5, AnonymousClass6RT r6) {
        Object obj;
        C18070vi.A0d(r6, 2);
        Object obj2 = this.A04.get();
        C18070vi.A0X(obj2);
        Iterator it = ((Iterable) obj2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass3MB) obj).BNA() == r6) {
                break;
            }
        }
        AnonymousClass3MB r1 = (AnonymousClass3MB) obj;
        if (r1 != null) {
            r1.BCg(r4, r5);
        }
    }

    public List BOf(AnonymousClass206 r8) {
        C18070vi.A0d(r8, 0);
        ArrayList A012 = ((C58262kP) this.A05.get()).A01(r8.A0x);
        ArrayList<AnonymousClass1D6> arrayList = new ArrayList<>();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AbstractCollection) this.A09.getValue()).contains(((AnonymousClass1D6) next).second)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass1D6 r4 : arrayList) {
            AnonymousClass206 A032 = ((AnonymousClass1W6) this.A02.get()).A01.A03(((Number) r4.first).longValue());
            if (A032 != null) {
                arrayList2.add(new AnonymousClass1D6(A032, r4.second));
            }
        }
        return arrayList2;
    }

    public AnonymousClass206 BWF(AnonymousClass206 r6) {
        if (r6 != null) {
            if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A00.get(), 8783) && r6.A11(67108864) && ((C26061Qr) this.A0F.get()).A02(r6.A0S)) {
                AnonymousClass25F A0M = r6.A0M(C693236t.class);
                C18070vi.A0X(A0M);
                ((C25931Qe) this.A03.get()).A0A(A0M);
                C693236t A002 = C60512o9.A00(r6);
                if (A002 != null) {
                    return ((AnonymousClass1W6) this.A02.get()).A01.A03(A002.A00);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r10 != null) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 BWH(X.AnonymousClass206 r18, X.C693236t r19) {
        /*
            r17 = this;
            r0 = 1
            r9 = r19
            X.C18070vi.A0d(r9, r0)
            r8 = r17
            X.00H r7 = r8.A00
            java.lang.Object r0 = r7.get()
            X.0vd r0 = (X.C18020vd) r0
            r6 = 8783(0x224f, float:1.2308E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            r10 = 0
            if (r0 == 0) goto L_0x00ef
            X.A51 r1 = r9.A02
            if (r1 == 0) goto L_0x00ef
            X.00H r0 = r8.A02
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.205 r14 = r1.A01
            X.1W2 r11 = r0.A01
            if (r14 == 0) goto L_0x00ef
            X.1BI r3 = r14.A00
            if (r3 == 0) goto L_0x00ef
            X.206 r10 = X.AnonymousClass1W2.A00(r14, r11)
            if (r10 != 0) goto L_0x009e
            X.1Cd r0 = r11.A06
            X.1at r4 = r0.get()
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0092 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0092 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r12 = X.AnonymousClass203.A03     // Catch:{ all -> 0x0092 }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0092 }
            X.1LW r0 = r11.A01     // Catch:{ all -> 0x0092 }
            long r0 = r0.A09(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0092 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0092 }
            boolean r0 = r14.A02     // Catch:{ all -> 0x0092 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0092 }
            r2[r1] = r0     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r14.A01     // Catch:{ all -> 0x0092 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0092 }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "GET_AVAILABLE_MESSAGE_BY_KEY_SQL"
            android.database.Cursor r2 = r13.A0A(r12, r0, r2)     // Catch:{ all -> 0x0092 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x007b
            r1 = 0
            r0 = 1
            X.206 r10 = r11.A04(r2, r3, r1, r0)     // Catch:{ all -> 0x008b }
        L_0x007b:
            r2.close()     // Catch:{ all -> 0x0092 }
            X.1LY r3 = r11.A03     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "CachedMessageStore/getAvailableMessage/key"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0092 }
            long r0 = r0 - r15
            r3.A01(r2, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0099
        L_0x008b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0099:
            r4.close()
            if (r10 == 0) goto L_0x00ef
        L_0x009e:
            X.6RT r4 = r9.A01
            java.lang.Object r0 = r7.get()
            X.0vd r0 = (X.C18020vd) r0
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            r5 = r18
            if (r0 == 0) goto L_0x00d7
            X.00H r0 = r8.A04
            java.lang.Object r0 = r0.get()
            X.C18070vi.A0X(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x00bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3MB r0 = (X.AnonymousClass3MB) r0
            X.6RT r0 = r0.BNA()
            if (r0 != r4) goto L_0x00bd
        L_0x00d0:
            X.3MB r1 = (X.AnonymousClass3MB) r1
            if (r1 == 0) goto L_0x00d7
            r1.CRg(r5, r10)
        L_0x00d7:
            X.205 r1 = r10.A0v
            com.whatsapp.jid.UserJid r0 = r10.A0I()
            X.A51 r3 = new X.A51
            r3.<init>(r0, r1)
            long r1 = r10.A0x
            X.36t r0 = new X.36t
            r0.<init>(r4, r3, r1)
            X.C60512o9.A01(r5, r0)
            return r10
        L_0x00ed:
            r1 = 0
            goto L_0x00d0
        L_0x00ef:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RV.BWH(X.206, X.36t):X.206");
    }

    public int BcL(AnonymousClass206 r23, byte[] bArr) {
        AnonymousClass190 r1;
        String str;
        Object obj;
        AnonymousClass206 r12 = r23;
        C693236t A002 = C60512o9.A00(r12);
        if (!r12.A11(67108864) || A002 == null) {
            r1 = this.A0C;
            str = "MessageAssociationManagerImpl/handleOrphanChildWithMessageAssociation/parent association info is null";
        } else {
            A51 a51 = A002.A02;
            if (a51 == null) {
                r1 = this.A0C;
                str = "MessageAssociationManagerImpl/handleOrphanChildWithMessageAssociation/parent association info's parent key is null";
            } else {
                AnonymousClass6RT r6 = A002.A01;
                C55012f4 r0 = (C55012f4) this.A0E.get();
                Object obj2 = r0.A03.get();
                C18070vi.A0X(obj2);
                Iterator it = ((Iterable) obj2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AnonymousClass3MB) obj).BNA() == r6) {
                        break;
                    }
                }
                AnonymousClass3MB r5 = (AnonymousClass3MB) obj;
                if (r5 != null) {
                    int BVp = r5.BVp();
                    if (Integer.valueOf(BVp) != null) {
                        C23624Bmt A0N = C165308av.DEFAULT_INSTANCE.A0N();
                        int i = r6.value;
                        A0N.A0E();
                        C165308av r52 = (C165308av) A0N.A00;
                        r52.bitField0_ |= 8;
                        r52.associationTypeForMessageAssociation_ = i;
                        if (BVp == 4) {
                            byte[] A0M = A0N.A0C().A0M();
                            C59392mE r3 = r0.A02;
                            AnonymousClass205 r14 = a51.A01;
                            boolean z = false;
                            if (r3.A01(r14) == null) {
                                z = true;
                            }
                            AnonymousClass205 r13 = r12.A0v;
                            C18070vi.A0W(r13);
                            AnonymousClass1BI A0H = r12.A0H();
                            AnonymousClass1BI r122 = a51.A00;
                            long j = r12.A0I;
                            int i2 = 2;
                            if (z) {
                                i2 = 1;
                            }
                            if (r0.A01.A01(new C195749tq(A0H, r122, r13, r14, (Long) null, bArr, A0M, 4, i2, j)) != 4) {
                                r0.A00.A0G("MessageAssociationOrphanManager/handleOrphanChildWithMessageAssociation/Failed to store orphan message", (String) null, false);
                            }
                            return 1;
                        } else if (BVp == 8) {
                            byte[] A0M2 = A0N.A0C().A0M();
                            C59392mE r32 = r0.A02;
                            AnonymousClass205 r142 = a51.A01;
                            boolean z2 = false;
                            if (r32.A01(r142) == null) {
                                z2 = true;
                            }
                            AnonymousClass205 r132 = r12.A0v;
                            C18070vi.A0W(r132);
                            AnonymousClass1BI A0H2 = r12.A0H();
                            AnonymousClass1BI r123 = a51.A00;
                            long j2 = r12.A0I;
                            int i3 = 2;
                            if (z2) {
                                i3 = 1;
                            }
                            if (r0.A01.A01(new C195749tq(A0H2, r123, r132, r142, (Long) null, (byte[]) null, A0M2, 8, i3, j2)) != 4) {
                                r0.A00.A0G("MessageAssociationOrphanManager/handleDetachedChildWithMessageAssociation/Failed to store orphan message", (String) null, false);
                            }
                            C60512o9.A01(r12, (C693236t) null);
                            r12.A0c(67108864);
                            r12.A0S = null;
                            return 2;
                        } else {
                            r0.A00.A0G("MessageAssociationOrphanManager/handleOrphanAndReturn/orphanMessageType is not supported", (String) null, false);
                            return 1;
                        }
                    }
                }
                r0.A00.A0G("MessageAssociationOrphanManager/handleOrphanAndReturn/orphan message type could not be inferred", (String) null, false);
                return 1;
            }
        }
        r1.A0G(str, (String) null, false);
        return 1;
    }

    public void BjL(C28791au r7, AnonymousClass206 r8) {
        Object obj;
        C18070vi.A0d(r8, 1);
        if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A00.get(), 8783)) {
            AnonymousClass25F A0M = r8.A0M(C693236t.class);
            C18070vi.A0X(A0M);
            ((C25931Qe) this.A03.get()).A0A(A0M);
            C693236t A002 = C60512o9.A00(r8);
            if (A002 != null) {
                AnonymousClass6RT r5 = A002.A01;
                if (((AbstractCollection) this.A08.getValue()).contains(r5)) {
                    Integer BUn = ((AnonymousClass121) this.A01.get()).BUn(Long.valueOf(r8.A0x));
                    AnonymousClass206 A032 = ((AnonymousClass1W6) this.A02.get()).A01.A03(A002.A00);
                    if (A032 != null) {
                        A00(r7, r8);
                        Object obj2 = this.A04.get();
                        C18070vi.A0X(obj2);
                        Iterator it = ((Iterable) obj2).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((AnonymousClass3MB) obj).BNA() == r5) {
                                break;
                            }
                        }
                        AnonymousClass3MB r2 = (AnonymousClass3MB) obj;
                        if (r2 != null) {
                            r2.CRA(A032, BUn, r8.A0x);
                        }
                    }
                }
            }
        }
    }

    public boolean BkB(AnonymousClass206 r7, AnonymousClass206 r8) {
        if (C20133A8t.A0B(r8)) {
            return true;
        }
        C693236t A002 = C60512o9.A00(r7);
        if (!r7.A11(67108864) || A002 == null || A002.A00 > 0) {
            return false;
        }
        return true;
    }

    public boolean BE9(AnonymousClass6RT r4) {
        Object obj;
        if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A00.get(), 8783)) {
            Object obj2 = this.A04.get();
            C18070vi.A0X(obj2);
            Iterator it = ((Iterable) obj2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AnonymousClass3MB) obj).BNA() == r4) {
                    break;
                }
            }
            AnonymousClass3MB r1 = (AnonymousClass3MB) obj;
            if (r1 == null || !r1.CM5()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Cursor BMu(C28781at r5, AnonymousClass6RT r6, long j) {
        this.A05.get();
        Cursor A0A2 = ((C28801av) r5).A02.A0A(C50722Vn.A00, "SELECT_ALL_MESSAGE_ASSOCIATION_FOR_PARENT_MESSAGE_ROW_ID_AND_ASSOCIATION_TYPE_QUERY_ID", new String[]{String.valueOf(j), String.valueOf(r6.value)});
        C18070vi.A0X(A0A2);
        return A0A2;
    }

    public void ByM(C28791au r11, int i, long j, boolean z) {
        int ordinal;
        AnonymousClass206 A032;
        Object obj;
        AnonymousClass00H r6 = this.A00;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, (C18020vd) r6.get(), 8783)) {
            Integer BUn = ((AnonymousClass121) this.A01.get()).BUn(Long.valueOf(j));
            C693236t A002 = ((C58262kP) this.A05.get()).A00(j);
            if (!(A002 == null || (A032 = ((AnonymousClass1W6) this.A02.get()).A01.A03(A002.A00)) == null)) {
                Object obj2 = this.A04.get();
                C18070vi.A0X(obj2);
                Iterator it = ((Iterable) obj2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AnonymousClass3MB) obj).BNA() == A002.A01) {
                        break;
                    }
                }
                AnonymousClass3MB r7 = (AnonymousClass3MB) obj;
                if (r7 != null) {
                    r7.CRA(A032, BUn, j);
                }
            }
        }
        if (C18020vd.A05(r4, (C18020vd) r6.get(), 8783)) {
            Iterator it2 = ((C58262kP) this.A05.get()).A01(j).iterator();
            while (it2.hasNext()) {
                AnonymousClass1D6 r5 = (AnonymousClass1D6) it2.next();
                AnonymousClass206 A033 = ((AnonymousClass1W6) this.A02.get()).A01.A03(((Number) r5.first).longValue());
                if (A033 != null) {
                    if (z) {
                        C49382Qg r0 = (C49382Qg) ((Map) this.A06.getValue()).get(r5.second);
                        if (r0 == null) {
                            ordinal = -1;
                        } else {
                            ordinal = r0.ordinal();
                        }
                        if (ordinal == 1) {
                            A00(r11, A033);
                        } else if (ordinal != 2) {
                            ((AnonymousClass121) this.A01.get()).BIJ(A033, i, true);
                        }
                    } else if (!((AbstractCollection) this.A07.getValue()).contains(r5.second)) {
                    }
                    ((AnonymousClass121) this.A01.get()).BIJ(A033, i, false);
                }
            }
        }
    }

    public void CR9(AnonymousClass206 r4, AnonymousClass206 r5, AnonymousClass6RT r6) {
        Object obj;
        Object obj2 = this.A04.get();
        C18070vi.A0X(obj2);
        Iterator it = ((Iterable) obj2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass3MB) obj).BNA() == r6) {
                break;
            }
        }
        AnonymousClass3MB r1 = (AnonymousClass3MB) obj;
        if (r1 != null) {
            r1.CRB(r4, r5);
        }
    }
}
