package X;

/* renamed from: X.1y1  reason: invalid class name and case insensitive filesystem */
public final class C42341y1 {
    public final C42231xq A00;
    public final C42241xr A01;
    public final C42251xs A02;
    public final C42261xt A03;
    public final C42271xu A04;
    public final C42281xv A05;
    public final C42291xw A06;
    public final C42301xx A07;
    public final C42311xy A08;
    public final C42321xz A09;
    public final C42331y0 A0A;

    public C42341y1(C42231xq r2, C42241xr r3, C42251xs r4, C42261xt r5, C42271xu r6, C42281xv r7, C42291xw r8, C42301xx r9, C42311xy r10, C42321xz r11, C42331y0 r12) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r8, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        C18070vi.A0d(r11, 10);
        C18070vi.A0d(r12, 11);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A09 = r11;
        this.A0A = r12;
    }

    public final C20083A6j A00(C20285AEt aEt) {
        C20277AEk aEk;
        C20285AEt aEt2 = aEt;
        C18070vi.A0d(aEt, 0);
        int i = aEt.A00;
        switch (i) {
            case 0:
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type of interactive message does not support customizations: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 1:
                return new C20083A6j(aEt, AnonymousClass10E.AIo(this.A00.A00.A00));
            case 2:
                return new C20083A6j(aEt, AnonymousClass10E.AIo(this.A01.A00.A00));
            case 3:
                AnonymousClass10E r0 = this.A02.A00.A00;
                return new C1774198m((C18030ve) r0.A04.get(), aEt, AnonymousClass10E.AIo(r0));
            case 4:
                return new C20083A6j(aEt, AnonymousClass10E.AIo(this.A04.A00.A00));
            case 5:
            case 9:
                if ("call_permission_request".equals(aEt.A00())) {
                    AnonymousClass10E r02 = this.A09.A00.A00;
                    C185129c4 AIo = AnonymousClass10E.AIo(r02);
                    C18030ve r1 = (C18030ve) r02.A04.get();
                    C18070vi.A0d(r1, 2);
                    return new C1773998k(r1, aEt, AIo);
                } else if (aEt.A04() && (aEk = aEt.A06) != null && aEk.A01 == 2) {
                    AnonymousClass10E r03 = this.A08.A00.A00;
                    C185129c4 AIo2 = AnonymousClass10E.AIo(r03);
                    C18030ve r12 = (C18030ve) r03.A04.get();
                    C18070vi.A0d(r12, 2);
                    return new C1773998k(r12, aEt, AIo2);
                } else if (aEt.A03()) {
                    AnonymousClass10E r04 = this.A0A.A00.A00;
                    C185129c4 AIo3 = AnonymousClass10E.AIo(r04);
                    C18030ve r13 = (C18030ve) r04.A04.get();
                    C18070vi.A0d(r13, 2);
                    return new C1773998k(r13, aEt, AIo3);
                } else {
                    AnonymousClass10E r05 = this.A05.A00.A00;
                    return new C1773998k((C18030ve) r05.A04.get(), aEt, AnonymousClass10E.AIo(r05));
                }
            case 6:
                AnonymousClass10E r06 = this.A06.A00.A00;
                return new C48422Mk((C18030ve) r06.A04.get(), aEt, AnonymousClass10E.AIo(r06));
            case 7:
                AnonymousClass10E r14 = this.A07.A00.A00;
                return new C1774098l((C18030ve) r14.A04.get(), aEt2, AnonymousClass10E.AIb(r14), AnonymousClass10E.AIf(r14), AnonymousClass10E.AIo(r14), this);
            case 10:
                return new C20083A6j(aEt, AnonymousClass10E.AIo(this.A03.A00.A00));
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown type of interactive message does not support customizations: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
        }
    }

    public final C20083A6j A01(AnonymousClass21K r2) {
        C18070vi.A0d(r2, 0);
        C20285AEt BPK = r2.BPK();
        if (BPK != null) {
            return A00(BPK);
        }
        return null;
    }
}
