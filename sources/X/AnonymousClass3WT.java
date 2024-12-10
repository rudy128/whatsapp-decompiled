package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.util.List;

/* renamed from: X.3WT  reason: invalid class name */
public class AnonymousClass3WT extends C38391rD {
    public final List A00;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    public AnonymousClass3WT(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment, List list) {
        this.A01 = intentChooserBottomSheetDialogFragment;
        this.A00 = list;
    }

    public int A0Q() {
        return this.A00.size();
    }

    public void Bmc(C42011xT r7, int i) {
        Drawable drawable;
        Drawable drawable2;
        C89464cV r4 = (C89464cV) this.A00.get(i);
        int i2 = r4.A05;
        if (r7 instanceof C73943Xx) {
            C73943Xx r2 = (C73943Xx) r7;
            TextView textView = r2.A01;
            textView.setText(r4.A06);
            AnonymousClass3MW.A1Q(textView);
            try {
                ImageView imageView = r2.A00;
                Context context = imageView.getContext();
                Integer num = r4.A02;
                if (i2 == 0) {
                    drawable2 = context.getPackageManager().getApplicationIcon("com.whatsapp");
                } else {
                    drawable2 = C24261Jm.A00(context, i2);
                }
                if (!(drawable2 == null || num == null)) {
                    drawable2 = C27831Xu.A02(drawable2);
                    C27831Xu.A0C(drawable2, num.intValue());
                }
                imageView.setImageDrawable(drawable2);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        } else if (r7 instanceof C73923Xv) {
            WDSActionTile wDSActionTile = ((C73923Xv) r7).A00;
            wDSActionTile.setText(r4.A06);
            Context context2 = wDSActionTile.getContext();
            Integer num2 = r4.A02;
            if (i2 == 0) {
                drawable = context2.getPackageManager().getApplicationIcon("com.whatsapp");
            } else {
                drawable = C24261Jm.A00(context2, i2);
            }
            if (!(drawable == null || num2 == null)) {
                drawable = C27831Xu.A02(drawable);
                C27831Xu.A0C(drawable, num2.intValue());
            }
            wDSActionTile.setIcon(drawable);
        }
        r7.A0H.setOnClickListener(new AnonymousClass78Q((Object) this, (Object) r4, 9));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3Xx, X.1xT] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.3Xv, X.1xT] */
    public C42011xT BqY(ViewGroup viewGroup, int i) {
        IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = this.A01;
        C18030ve r0 = intentChooserBottomSheetDialogFragment.A03;
        C18040vf r3 = C18040vf.A02;
        int i2 = 2131625719;
        if (C18020vd.A05(r3, r0, 9156)) {
            i2 = 2131625718;
        }
        View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, i2);
        if (C18020vd.A05(r3, intentChooserBottomSheetDialogFragment.A03, 9156)) {
            ? r1 = new C42011xT(A09);
            r1.A00 = (WDSActionTile) A09.findViewById(2131427530);
            return r1;
        }
        ? r12 = new C42011xT(A09);
        r12.A01 = C17880vN.A0E(A09, 2131432903);
        r12.A00 = AnonymousClass3MW.A0H(A09, 2131431496);
        return r12;
    }
}
