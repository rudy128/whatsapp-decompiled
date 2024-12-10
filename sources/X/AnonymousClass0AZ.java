package X;

import androidx.compose.foundation.FocusableNode$onFocusEvent$1;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;

/* renamed from: X.0AZ  reason: invalid class name */
public final class AnonymousClass0AZ extends C014308l implements C17660v1, C17650v0, C17570us, C17600uv {
    public C16360s8 A00;
    public final C014108j A01;
    public final C16200rs A02;
    public final AnonymousClass09J A03;
    public final AnonymousClass09U A04;
    public final C015208v A05;
    public final AnonymousClass07M A06;

    public /* synthetic */ void C2y(long j) {
    }

    public void BCT(C16520sO r2) {
        this.A04.BCT(r2);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.0Ud, X.0r0, java.lang.Object] */
    public void Buq(C16360s8 r7) {
        if (!C18070vi.A18(this.A00, r7)) {
            boolean Ber = r7.Ber();
            if (Ber) {
                AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new FocusableNode$onFocusEvent$1(this, (C30391dr) null), A0B(), 3);
            }
            if (this.A07) {
                AnonymousClass0QV.A07(this);
            }
            C014108j r4 = this.A01;
            C17210uI r3 = r4.A01;
            if (r3 != null) {
                C05420Ud r1 = r4.A00;
                if (Ber) {
                    if (r1 != null) {
                        C014108j.A00(r4, new C05460Uh(r1), r3);
                        r4.A00 = null;
                    }
                    ? obj = new Object();
                    C014108j.A00(r4, obj, r3);
                    r4.A00 = obj;
                } else if (r1 != null) {
                    C014108j.A00(r4, new C05460Uh(r1), r3);
                    r4.A00 = null;
                }
            }
            this.A05.A0N(Ber);
            AnonymousClass09J r2 = this.A03;
            AnonymousClass0XM r12 = null;
            if (Ber) {
                C16440sG A002 = AnonymousClass09J.A00(r2);
                if (A002 != null) {
                    r12 = A002.CBi();
                }
            } else {
                C16430sF r0 = r2.A00;
                if (r0 != null) {
                    r0.release();
                }
            }
            r2.A00 = r12;
            r2.A01 = Ber;
            this.A04.A00 = Ber;
            this.A00 = r7;
        }
    }

    public void BvI(C16910tQ r2) {
        this.A05.BvI(r2);
    }

    public void C0g(C16910tQ r2) {
        this.A06.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.08j, X.0XW, X.0rH] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.0XW, X.09J, X.0rH] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.0XW, X.08v, X.0rH] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.08w, X.07M, X.0rH] */
    public AnonymousClass0AZ(C17210uI r3) {
        AnonymousClass09U r0 = new AnonymousClass09U();
        A0N(r0);
        this.A04 = r0;
        ? r02 = new AnonymousClass0XW();
        r02.A01 = r3;
        A0N(r02);
        this.A01 = r02;
        ? r03 = new AnonymousClass0XW();
        A0N(r03);
        this.A03 = r03;
        ? r04 = new AnonymousClass0XW();
        A0N(r04);
        this.A05 = r04;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl = new BringIntoViewRequesterImpl();
        this.A02 = bringIntoViewRequesterImpl;
        ? r05 = new C015308w();
        r05.A00 = bringIntoViewRequesterImpl;
        A0N(r05);
        this.A06 = r05;
    }

    public /* synthetic */ boolean BZA() {
        return false;
    }

    public /* synthetic */ boolean BZC() {
        return false;
    }
}
