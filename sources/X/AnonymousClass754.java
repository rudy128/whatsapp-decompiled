package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import java.util.List;

/* renamed from: X.754  reason: invalid class name */
public class AnonymousClass754 implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass754(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj;
        this.A04 = obj3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (this.A00 != 0) {
            List list = (List) this.A02;
            StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) this.A03;
            List list2 = (List) this.A04;
            int i2 = this.A01;
            if (AnonymousClass000.A1a(list)) {
                AnonymousClass00H r0 = stickerExpressionsFragment.A0Q;
                if (r0 != null) {
                    C1193467t A0w = C108945cZ.A0w(((C132486mt) r0.get()).A01);
                    A0w.A07.execute(new AnonymousClass7RQ(A0w, list));
                } else {
                    str = "recentStickerHandler";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            if (AnonymousClass000.A1a(list2)) {
                AnonymousClass1SB r02 = stickerExpressionsFragment.A0I;
                if (r02 != null) {
                    r02.A0J(list2);
                } else {
                    str = "stickerRepository";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            StickerExpressionsFragment.A02(stickerExpressionsFragment);
            String A0k = C72473Md.A0k(AnonymousClass3MZ.A09(stickerExpressionsFragment), i2, 2131755266);
            C18070vi.A0X(A0k);
            CoordinatorLayout coordinatorLayout = stickerExpressionsFragment.A04;
            if (coordinatorLayout != null) {
                C23520Bik.A00((Context) null, coordinatorLayout, A0k, 0).A08();
                return;
            }
            return;
        }
        C1404271j r4 = (C1404271j) this.A02;
        int i3 = this.A01;
        Activity activity = (Activity) this.A03;
        C1404271j.A00(r4, 0, 1, (long) i3, r4.A00.A00().getTime());
        AnonymousClass4Yv.A00(activity, 115);
        Intent A0G = C108945cZ.A0G("android.intent.action.VIEW");
        A0G.setData(((C40751vD) this.A04).A03());
        activity.startActivity(A0G);
    }
}
