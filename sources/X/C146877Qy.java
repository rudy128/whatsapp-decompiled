package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

/* renamed from: X.7Qy  reason: invalid class name and case insensitive filesystem */
public class C146877Qy implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C146877Qy(C23841Bqy bqy, C37721q1 r3, int i) {
        this.A00 = 0;
        this.A02 = r3;
        this.A03 = bqy;
        this.A01 = i;
    }

    public final void run() {
        String str;
        AnonymousClass1E7 r1;
        ConstraintLayout constraintLayout;
        switch (this.A00) {
            case 0:
                C23841Bqy bqy = (C23841Bqy) this.A03;
                int i = this.A01;
                C18070vi.A0d(bqy, 1);
                C37721q1.A00(bqy, (C37721q1) this.A02, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, i);
                return;
            case 1:
                int i2 = this.A01;
                AnonymousClass206 r12 = (AnonymousClass206) this.A02;
                DocumentWarningDialogFragment documentWarningDialogFragment = (DocumentWarningDialogFragment) this.A03;
                C18070vi.A0d(r12, 1);
                AnonymousClass62K r2 = new AnonymousClass62K();
                r2.A00 = Integer.valueOf(i2);
                AnonymousClass1BI r13 = r12.A0v.A00;
                if (r13 != null) {
                    AnonymousClass1M9 r0 = documentWarningDialogFragment.A04;
                    if (r0 != null) {
                        r1 = r0.A0E(r13);
                    } else {
                        str = "contactManager";
                        C18070vi.A11(str);
                        throw null;
                    }
                } else {
                    r1 = null;
                }
                r2.A01 = AnonymousClass3MY.A0f();
                if (r1 != null && r1.A0B()) {
                    r2.A01 = 1;
                }
                AnonymousClass18K r02 = documentWarningDialogFragment.A07;
                if (r02 != null) {
                    r02.CC7(r2);
                    return;
                }
                str = "wamRuntime";
                C18070vi.A11(str);
                throw null;
            case 2:
                int i3 = this.A01;
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = ((C112065ks) this.A02).A02;
                C36451nu r03 = viewSharedContactArrayActivity.A0I;
                AnonymousClass1GP supportFragmentManager = viewSharedContactArrayActivity.getSupportFragmentManager();
                C219217x r4 = viewSharedContactArrayActivity.A0D;
                r03.A06(viewSharedContactArrayActivity, supportFragmentManager, viewSharedContactArrayActivity.A03, r4, viewSharedContactArrayActivity.A0E, (AnonymousClass73C) this.A03, i3);
                ((C37721q1) viewSharedContactArrayActivity.A0M.get()).A06(true, 10);
                return;
            default:
                WDSListItem wDSListItem = (WDSListItem) this.A02;
                int i4 = this.A01;
                View view = (View) this.A03;
                View findViewById = wDSListItem.findViewById(2131434755);
                if (findViewById != null && (constraintLayout = (ConstraintLayout) wDSListItem.findViewById(2131434759)) != null) {
                    C26264Cw9 cw9 = new C26264Cw9();
                    cw9.A0C(constraintLayout);
                    if (i4 > wDSListItem.A00) {
                        C72463Mc.A14(view, view.getPaddingLeft(), wDSListItem.getResources().getDimensionPixelSize(2131169544));
                        cw9.A06(view.getId());
                    } else {
                        C72463Mc.A14(view, view.getPaddingLeft(), 0);
                        cw9.A09(view.getId(), 4, findViewById.getId(), 4);
                    }
                    cw9.A0A(constraintLayout);
                    return;
                }
                return;
        }
    }

    public C146877Qy(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
    }
}
