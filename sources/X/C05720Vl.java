package X;

/* renamed from: X.0Vl  reason: invalid class name and case insensitive filesystem */
public final class C05720Vl implements AnonymousClass0t3, C15760rA {
    public AnonymousClass0tC A00;
    public C16680sp A01;
    public Object A02;
    public Object[] A03;
    public C16310s3 A04;
    public String A05;
    public final C18090vk A06 = new C08150ed(this);

    private final void A00() {
        StringBuilder sb;
        String str;
        String A0y;
        AnonymousClass0tC r3 = this.A00;
        C16310s3 r2 = this.A04;
        if (r2 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("entry(");
            A10.append(r2);
            throw AnonymousClass001.A12(") is not null", A10);
        } else if (r3 != null) {
            C18090vk r1 = this.A06;
            Object invoke = r1.invoke();
            if (invoke == null || r3.BE7(invoke)) {
                this.A04 = r3.CE3(this.A05, r1);
                return;
            }
            if (invoke instanceof C17260uN) {
                C17260uN r22 = (C17260uN) invoke;
                if (r22.BXD() == AnonymousClass0Q9.A00() || r22.BXD() == AnonymousClass0Q9.A06() || r22.BXD() == AnonymousClass0Q9.A05()) {
                    sb = AnonymousClass000.A10();
                    sb.append("MutableState containing ");
                    sb.append(r22.getValue());
                    str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                    A0y = AnonymousClass000.A0y(str, sb);
                } else {
                    A0y = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                sb = AnonymousClass000.A10();
                sb.append(invoke);
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                A0y = AnonymousClass000.A0y(str, sb);
            }
            throw AnonymousClass000.A0k(A0y);
        }
    }

    public final void A01(AnonymousClass0tC r4, C16680sp r5, Object obj, String str, Object[] objArr) {
        boolean z;
        boolean z2 = true;
        if (this.A00 != r4) {
            this.A00 = r4;
            z = true;
        } else {
            z = false;
        }
        if (!C18070vi.A18(this.A05, str)) {
            this.A05 = str;
        } else {
            z2 = z;
        }
        this.A01 = r5;
        this.A02 = obj;
        this.A03 = objArr;
        C16310s3 r0 = this.A04;
        if (r0 != null && z2) {
            r0.CQA();
            this.A04 = null;
            A00();
        }
    }

    public void Bkh() {
        C16310s3 r0 = this.A04;
        if (r0 != null) {
            r0.CQA();
        }
    }

    public void Bux() {
        C16310s3 r0 = this.A04;
        if (r0 != null) {
            r0.CQA();
        }
    }

    public C05720Vl(AnonymousClass0tC r2, C16680sp r3, Object obj, String str, Object[] objArr) {
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = str;
        this.A02 = obj;
        this.A03 = objArr;
    }

    public void C2z() {
        A00();
    }
}
