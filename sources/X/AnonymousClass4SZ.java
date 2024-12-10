package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4SZ  reason: invalid class name */
public class AnonymousClass4SZ {
    public boolean A00;
    public final Context A01;
    public final LayoutInflater A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final WaTextView A07;
    public final C24921Me A08;
    public final C37451pZ A09;
    public final C18000vb A0A;
    public final AnonymousClass1CJ A0B;
    public final WDSButton A0C;
    public final WDSButton A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final RecyclerView A0I;
    public final TextEmojiLabel A0J;
    public final TextEmojiLabel A0K;
    public final AnonymousClass1M9 A0L;
    public final AnonymousClass11P A0M;
    public final C18030ve A0N;
    public final C73683Wx A0O;
    public final AnonymousClass1PU A0P;

    public void A00(Bitmap bitmap) {
        if (bitmap == null) {
            Log.e("GroupInviteInfoViewController/decode-photo-bytes-returns-null");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100);
        C74603c1.A00(alphaAnimation, this, bitmap, 9);
        this.A06.startAnimation(alphaAnimation);
    }

    public void A01(AnonymousClass4PG r20, long j) {
        AnonymousClass1E7 r11;
        String str;
        int i;
        AnonymousClass4PG r10 = r20;
        UserJid userJid = r10.A06;
        if (userJid != null) {
            r11 = this.A0L.A0H(userJid);
        } else {
            r11 = null;
        }
        this.A0K.A0R(r10.A09);
        if (r11 == null || !this.A00) {
            this.A0F.setVisibility(8);
        } else {
            TextView textView = this.A0F;
            textView.setVisibility(0);
            int i2 = 2131891520;
            if (r10.A02 == 1) {
                i2 = 2131891524;
            }
            AnonymousClass3MY.A0y(this.A01, textView, new Object[]{this.A08.A0O(r11)}, i2);
        }
        C42661yX r0 = r10.A07;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A03;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        TextEmojiLabel textEmojiLabel = this.A0J;
        if (!isEmpty) {
            textEmojiLabel.A0R(str);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        List list = r10.A0A;
        boolean A1a = AnonymousClass000.A1a(list);
        TextView textView2 = this.A0H;
        textView2.setVisibility(C72453Mb.A07(A1a ? 1 : 0));
        this.A0E.setVisibility(C72453Mb.A01(A1a));
        this.A0I.setVisibility(C72453Mb.A07(A1a));
        C18000vb r14 = this.A0A;
        int i3 = r10.A03;
        long j2 = (long) i3;
        Integer valueOf = Integer.valueOf(i3);
        textView2.setText(r14.A0K(new Object[]{valueOf}, 2131755314, j2));
        this.A0G.setText(r14.A0K(new Object[]{valueOf}, 2131755314, j2));
        C73683Wx r02 = this.A0O;
        r02.A01 = list;
        r02.notifyDataSetChanged();
        r02.A00 = i3;
        r02.notifyDataSetChanged();
        int i4 = r10.A02;
        if (i4 == 1 || i4 == 2 || i4 == 6 || i4 == 3) {
            WaTextView waTextView = this.A07;
            waTextView.setVisibility(0);
            if (C18020vd.A05(C18040vf.A02, this.A0N, 5021)) {
                i = 2131891514;
                if (i4 != 1) {
                    i = 2131891535;
                }
            } else {
                i = 2131891536;
            }
            waTextView.setText(i);
            waTextView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            waTextView.A0L();
        } else {
            long A012 = AnonymousClass11P.A01(this.A0M);
            long j3 = j;
            int i5 = ((j - A012) > 0 ? 1 : ((j - A012) == 0 ? 0 : -1));
            WaTextView waTextView2 = this.A07;
            if (i5 > 0) {
                waTextView2.setText(C64052u8.A00(this.A01, r14, j3, A012));
                waTextView2.setVisibility(0);
            } else {
                waTextView2.setVisibility(8);
            }
        }
        View view = this.A03;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C90404e1(this, (float) view.getHeight()));
        this.A05.setVisibility(0);
    }

    public AnonymousClass4SZ(Context context, ViewGroup viewGroup, AnonymousClass1M9 r6, C24921Me r7, C37451pZ r8, AnonymousClass11P r9, C18000vb r10, AnonymousClass1CJ r11, C18030ve r12, AnonymousClass1PU r13) {
        this.A01 = context;
        this.A0M = r9;
        this.A0N = r12;
        this.A0B = r11;
        this.A02 = LayoutInflater.from(context);
        this.A0L = r6;
        this.A08 = r7;
        this.A0A = r10;
        this.A0P = r13;
        this.A09 = r8;
        this.A0F = C17880vN.A0E(viewGroup, 2131431242);
        this.A0K = AnonymousClass3MX.A0W(viewGroup, 2131431270);
        this.A0J = AnonymousClass3MX.A0W(viewGroup, 2131431248);
        this.A0E = AnonymousClass3MW.A0D(viewGroup, 2131433450);
        this.A0H = C17880vN.A0E(viewGroup, 2131433447);
        this.A0G = C17880vN.A0E(viewGroup, 2131433433);
        this.A06 = AnonymousClass3MW.A0H(viewGroup, 2131431280);
        this.A07 = AnonymousClass3MW.A0U(viewGroup, 2131431802);
        this.A05 = viewGroup.findViewById(2131431281);
        this.A04 = viewGroup.findViewById(2131431263);
        this.A03 = viewGroup.findViewById(2131428018);
        this.A0C = AnonymousClass3MW.A0q(viewGroup, 2131431788);
        this.A0D = AnonymousClass3MW.A0q(viewGroup, 2131431804);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(viewGroup, 2131431275);
        this.A0I = A0Q;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.A1Z(0);
        A0Q.setLayoutManager(linearLayoutManager);
        C73683Wx r0 = new C73683Wx(this);
        this.A0O = r0;
        A0Q.setAdapter(r0);
    }
}
