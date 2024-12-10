package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4RA  reason: invalid class name */
public final class AnonymousClass4RA {
    public long A00 = SystemClock.elapsedRealtime();
    public long A01;
    public String A02 = "";
    public String A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass00H A05;

    public final void A00(View view, ViewGroup viewGroup) {
        AnonymousClass00H r8 = this.A05;
        if (((AnonymousClass4OA) r8.get()).A00) {
            if (this.A03 == null) {
                this.A03 = C60312no.A00(viewGroup.getResources(), viewGroup);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.A00;
            if (j > this.A01) {
                this.A01 = j;
                StringBuilder A10 = AnonymousClass000.A10();
                C17900vP.A0a(view, A10);
                A10.append('(');
                this.A02 = C17900vP.A0B(C60312no.A00(view.getResources(), view), A10);
                AnonymousClass4OA r1 = (AnonymousClass4OA) r8.get();
                String str = this.A03;
                if (str == null) {
                    C18070vi.A11("parentId");
                    throw null;
                }
                String str2 = this.A02;
                C18070vi.A0d(str2, 1);
                r1.A03.put(str, new C194569rw(j, str2, str));
            }
            this.A00 = elapsedRealtime;
        }
    }

    public AnonymousClass4RA(AnonymousClass11P r3, AnonymousClass00H r4) {
        C18070vi.A0j(r3, r4);
        this.A04 = r3;
        this.A05 = r4;
    }
}
