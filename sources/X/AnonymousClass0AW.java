package X;

import android.view.KeyEvent;
import androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1;
import androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1;
import java.util.Map;

/* renamed from: X.0AW  reason: invalid class name */
public abstract class AnonymousClass0AW extends C014308l implements C17690v4, C17630uy {
    public C17210uI A00;
    public AnonymousClass0JM A01;
    public C18090vk A02;
    public boolean A03;
    public final C03200Ha A04;

    public /* synthetic */ AnonymousClass0AW(C17210uI r1, AnonymousClass0JM r2, String str, C18090vk r4, AnonymousClass1Y1 r5, boolean z) {
        this(r1, r2, r4, z);
    }

    /* renamed from: Bnm */
    public void CA7() {
        ((AnonymousClass079) this).A00.CA7();
    }

    public void C0v(AnonymousClass0Hm r2, AnonymousClass0CQ r3, long j) {
        ((AnonymousClass079) this).A00.C0v(r2, r3, j);
    }

    public boolean C1L(KeyEvent keyEvent) {
        return false;
    }

    public final void A0O() {
        C03200Ha r5 = this.A04;
        AnonymousClass0Uk r0 = r5.A01;
        if (r0 != null) {
            this.A00.CPx(new C05480Uj(r0));
        }
        Map map = r5.A02;
        for (AnonymousClass0Uk r2 : map.values()) {
            this.A00.CPx(new C05480Uj(r2));
        }
        r5.A01 = null;
        map.clear();
    }

    public final void A0P(C17210uI r2, AnonymousClass0JM r3, C18090vk r4, boolean z) {
        if (!C18070vi.A18(this.A00, r2)) {
            A0O();
            this.A00 = r2;
        }
        if (this.A03 != z) {
            if (!z) {
                A0O();
            }
            this.A03 = z;
        }
        this.A01 = r3;
        this.A02 = r4;
    }

    public boolean BwR(KeyEvent keyEvent) {
        int keyCode;
        if (this.A03) {
            long j = C02890Fu.A00;
            if (C02580Eo.A00(keyEvent) == 2 && ((keyCode = (int) ((((long) keyEvent.getKeyCode()) << 32) >> 32)) == 23 || keyCode == 66 || keyCode == 160)) {
                C03200Ha r3 = this.A04;
                Map map = r3.A02;
                if (map.containsKey(new AnonymousClass0ND(((long) keyEvent.getKeyCode()) << 32))) {
                    return false;
                }
                AnonymousClass0Uk r32 = new AnonymousClass0Uk(r3.A00);
                map.put(new AnonymousClass0ND(((long) keyEvent.getKeyCode()) << 32), r32);
                AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new AbstractClickableNode$onKeyEvent$1(this, r32, (C30391dr) null), A0B(), 3);
                return true;
            }
        }
        if (!this.A03) {
            return false;
        }
        long j2 = C02890Fu.A00;
        if (C02580Eo.A00(keyEvent) != 1) {
            return false;
        }
        int keyCode2 = (int) ((((long) keyEvent.getKeyCode()) << 32) >> 32);
        if (keyCode2 != 23 && keyCode2 != 66 && keyCode2 != 160) {
            return false;
        }
        AnonymousClass0Uk r0 = (AnonymousClass0Uk) this.A04.A02.remove(new AnonymousClass0ND(AnonymousClass001.A0u(keyEvent)));
        if (r0 != null) {
            AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new AbstractClickableNode$onKeyEvent$2$1(this, r0, (C30391dr) null), A0B(), 3);
        }
        this.A02.invoke();
        return true;
    }

    public AnonymousClass0AW(C17210uI r2, AnonymousClass0JM r3, C18090vk r4, boolean z) {
        this.A00 = r2;
        this.A03 = z;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = new C03200Ha();
    }

    public void A0M() {
        A0O();
    }

    public /* synthetic */ boolean Bdj() {
        return false;
    }

    public /* synthetic */ boolean CLc() {
        return false;
    }
}
