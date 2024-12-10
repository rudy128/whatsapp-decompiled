package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.6NY  reason: invalid class name */
public abstract class AnonymousClass6NY extends AnonymousClass6NZ implements AnonymousClass869 {
    public A2X A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public String A03;
    public String A04;
    public boolean A05 = true;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            Intent intent = getIntent();
            C18070vi.A0b(intent);
            String stringExtra = intent.getStringExtra("fds_observer_id");
            C18070vi.A0b(stringExtra);
            A2X A022 = ((A2V) r0.get()).A02(stringExtra);
            this.A00 = A022;
            AnonymousClass7NI.A00(A022, C21101AeV.class, this, 14);
            A2X a2x = this.A00;
            if (a2x != null) {
                AnonymousClass7NI.A00(a2x, C21102AeW.class, this, 15);
            }
            A2X a2x2 = this.A00;
            if (a2x2 != null) {
                AnonymousClass7NI.A00(a2x2, AnonymousClass7NR.class, this, 16);
            }
            Intent intent2 = getIntent();
            C18070vi.A0b(intent2);
            String stringExtra2 = intent2.getStringExtra("fds_state_name");
            C18070vi.A0b(stringExtra2);
            this.A04 = stringExtra2;
            return;
        }
        C18070vi.A11("uiObserversFactory");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        A2X a2x = this.A00;
        if (a2x != null) {
            a2x.A04(this);
        }
        this.A00 = null;
    }
}
