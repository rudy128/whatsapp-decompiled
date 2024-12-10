package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import java.util.HashSet;

/* renamed from: X.79h  reason: invalid class name and case insensitive filesystem */
public final class C1423979h implements AnonymousClass02H {
    public Runnable A00;
    public final Context A01;
    public final TextView A02;
    public final /* synthetic */ MediaPickerFragment A03;

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r5) {
        if (AnonymousClass3MY.A01(menuItem, 1) != 0) {
            return false;
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        mediaPickerFragment.A2K((Uri) null, mediaPickerFragment.A0Q);
        return false;
    }

    public C1423979h(Context context, MediaPickerFragment mediaPickerFragment) {
        this.A03 = mediaPickerFragment;
        this.A01 = context;
        TextView textView = (TextView) AnonymousClass3MY.A0D(LayoutInflater.from(context), 2131623994);
        this.A02 = textView;
        AnonymousClass1HF.A0f(textView, new C22667BJi(this, 13));
    }

    public final boolean BqR(Menu menu, AnonymousClass02B r8) {
        TextView textView = this.A02;
        r8.A09(textView);
        MediaPickerFragment mediaPickerFragment = this.A03;
        int A002 = AnonymousClass1YL.A00(mediaPickerFragment.A1n(), 2130969991, 2131101077);
        Context context = this.A01;
        AnonymousClass3MX.A1C(context, textView, A002);
        C108965cb.A0B(mediaPickerFragment).setStatusBarColor(C19740yt.A00(context, AnonymousClass1YL.A00(mediaPickerFragment.A1n(), 2130969990, 2131101076)));
        return true;
    }

    public final void BrJ(AnonymousClass02B r5) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        if (mediaPickerFragment.A0J) {
            C108955ca.A1M(mediaPickerFragment);
        }
        mediaPickerFragment.A04 = null;
        mediaPickerFragment.A2I();
        C108965cb.A0B(mediaPickerFragment).setStatusBarColor(AnonymousClass3Ma.A00(this.A01, 2130968798, 2131099872));
    }

    public boolean C1U(Menu menu, AnonymousClass02B r8) {
        String quantityString;
        MediaPickerFragment mediaPickerFragment = this.A03;
        HashSet hashSet = mediaPickerFragment.A0Q;
        if (hashSet.size() == 0) {
            quantityString = mediaPickerFragment.A1H(2131895609);
        } else {
            int size = hashSet.size();
            Resources A09 = AnonymousClass3MZ.A09(mediaPickerFragment);
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, size, 0);
            quantityString = A09.getQuantityString(2131755262, size, objArr);
        }
        TextView textView = this.A02;
        textView.setText(quantityString);
        if (this.A00 == null && !textView.isSelected()) {
            AnonymousClass7RJ r2 = new AnonymousClass7RJ(this, 5);
            this.A00 = r2;
            textView.postDelayed(r2, 1000);
        }
        return true;
    }
}
