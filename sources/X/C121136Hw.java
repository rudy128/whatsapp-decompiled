package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.6Hw  reason: invalid class name and case insensitive filesystem */
public class C121136Hw extends C145227Kl {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularProgressBar A03;
    public AnonymousClass725 A04;
    public final C26631Sw A05;
    public final AnonymousClass1SB A06;
    public final AnonymousClass88B A07;
    public final StickerPackDownloader A08;

    public C121136Hw(Context context, LayoutInflater layoutInflater, C18030ve r9, C26631Sw r10, AnonymousClass725 r11, AnonymousClass1SB r12, AnonymousClass88B r13, StickerPackDownloader stickerPackDownloader, int i, int i2) {
        super(context, layoutInflater, r9, i, i2);
        this.A06 = r12;
        this.A08 = stickerPackDownloader;
        this.A05 = r10;
        this.A04 = r11;
        this.A07 = r13;
    }

    public void A05() {
        View view;
        if (this instanceof C121106Ht) {
            C121106Ht r4 = (C121106Ht) this;
            CircularProgressBar circularProgressBar = r4.A03;
            if (!(circularProgressBar == null || r4.A02 == null)) {
                if (r4.A02) {
                    circularProgressBar.setVisibility(0);
                    r4.A02.setVisibility(0);
                    boolean isEmpty = TextUtils.isEmpty(r4.A04.A04);
                    TextView textView = r4.A02;
                    if (isEmpty) {
                        textView.setText(2131896445);
                    } else {
                        Context context = r4.A0B;
                        Object[] A1a = AnonymousClass3MW.A1a();
                        A1a[0] = r4.A04.A04;
                        AnonymousClass3MY.A0y(context, textView, A1a, 2131896446);
                    }
                } else {
                    circularProgressBar.setVisibility(8);
                    r4.A02.setVisibility(8);
                }
            }
            if (r4.A00 == null) {
                return;
            }
            if (r4.A04.A07.size() != 0 || r4.A02) {
                r4.A00.setVisibility(8);
                return;
            }
            r4.A00.setVisibility(0);
            AnonymousClass78P.A00(r4.A01, r4, 27);
            return;
        }
        CircularProgressBar circularProgressBar2 = this.A03;
        if (circularProgressBar2 != null && this.A02 != null && (view = this.A01) != null) {
            if (this.A04.A09) {
                circularProgressBar2.setVisibility(0);
                this.A02.setVisibility(0);
                this.A01.setVisibility(0);
                boolean isEmpty2 = TextUtils.isEmpty(this.A04.A04);
                TextView textView2 = this.A02;
                if (isEmpty2) {
                    textView2.setText(2131896441);
                } else {
                    AnonymousClass3MY.A0y(this.A0B, textView2, new Object[]{this.A04.A04}, 2131896442);
                }
                int i = this.A00;
                CircularProgressBar circularProgressBar3 = this.A03;
                if (i >= 0) {
                    circularProgressBar3.setIndeterminate(false);
                    this.A03.setProgress(this.A00);
                    return;
                }
                circularProgressBar3.setIndeterminate(true);
                return;
            }
            view.setVisibility(8);
            this.A03.setVisibility(8);
            this.A02.setVisibility(8);
        }
    }

    public void A06(AnonymousClass725 r3) {
        this.A04 = r3;
        A00().A0U(r3.A07);
    }

    public void A03(View view) {
        this.A03 = (CircularProgressBar) AnonymousClass1HF.A06(view, 2131433385);
        this.A02 = AnonymousClass3MW.A0J(view, 2131433386);
        View A062 = AnonymousClass1HF.A06(view, 2131428815);
        this.A01 = A062;
        AnonymousClass6LG.A00(A062, this, 29);
        A05();
    }
}
