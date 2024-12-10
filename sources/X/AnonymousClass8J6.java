package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;

/* renamed from: X.8J6  reason: invalid class name */
public class AnonymousClass8J6 extends C42011xT {
    public C59822mw A00;
    public AnonymousClass1E7 A01;
    public final PopupMenu A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final WaImageView A05;
    public final AnonymousClass1VP A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass1TD A08;
    public final AnonymousClass121 A09;
    public final C32481hG A0A;
    public final AnonymousClass1TA A0B;
    public final C27081Uq A0C;
    public final C33231iU A0D;
    public final C18030ve A0E;
    public final AnonymousClass1PP A0F;
    public final AnonymousClass1W6 A0G;
    public final AnonymousClass10I A0H;
    public final AnonymousClass00H A0I;
    public final C42141xh A0J;
    public final WaImageView A0K;
    public final WaTextView A0L;
    public final WaTextView A0M;
    public final ThumbnailButton A0N;
    public final C37451pZ A0O;

    public static void A00(Context context, AnonymousClass8J6 r5) {
        String str;
        C59822mw r0 = r5.A00;
        if (r0 == null) {
            str = "UpcomingActivityCallViewHolder/openPrecallLobby schedule call null";
        } else {
            AnonymousClass1EC A0i = AnonymousClass3MW.A0i(r0.A04);
            if (A0i == null) {
                str = "UpcomingActivityCallViewHolder/openPrecallLobby group jid is null";
            } else {
                r5.A0H.CGN(new C21434Ak1(r5, context, A0i, 19));
                return;
            }
        }
        Log.w(str);
    }

    public void A0B(C20556APq aPq) {
        C192409oL r3 = aPq.A00;
        AnonymousClass1E7 r2 = aPq.A02;
        this.A01 = r2;
        this.A00 = aPq.A01;
        this.A0O.A07(this.A0N, r2);
        this.A0M.setText(this.A00.A00());
        this.A0J.A05(r2);
        this.A0L.setText(r3.A01);
        WaImageView waImageView = this.A0K;
        View view = this.A0H;
        AnonymousClass3MX.A1B(view.getContext(), waImageView, r3.A00);
        boolean z = r3.A02;
        PopupMenu popupMenu = this.A02;
        popupMenu.getMenu().clear();
        popupMenu.getMenu().add(0, 0, 1, 2131895428);
        if (z) {
            SpannableString A092 = AnonymousClass8BU.A09(view.getContext(), 2131887906);
            A092.setSpan(new ForegroundColorSpan(-65536), 0, A092.length(), 0);
            popupMenu.getMenu().add(0, 1, 2, A092);
        }
        popupMenu.setOnMenuItemClickListener(new AG7(this));
        this.A05.setOnClickListener(new C90034dQ(this, 49));
        C89884dB.A00(view, this, 0);
    }

    public AnonymousClass8J6(View view, AnonymousClass1KB r5, AnonymousClass11S r6, C72043Kk r7, AnonymousClass1VP r8, C37451pZ r9, AnonymousClass11P r10, AnonymousClass1TD r11, AnonymousClass121 r12, C32481hG r13, AnonymousClass1TA r14, C27081Uq r15, C33231iU r16, C18030ve r17, AnonymousClass1PP r18, AnonymousClass1W6 r19, AnonymousClass10I r20, AnonymousClass00H r21) {
        super(view);
        this.A0O = r9;
        this.A07 = r10;
        this.A0E = r17;
        this.A03 = r5;
        this.A04 = r6;
        this.A0H = r20;
        this.A06 = r8;
        this.A0A = r13;
        this.A0G = r19;
        this.A08 = r11;
        this.A0F = r18;
        this.A09 = r12;
        this.A0C = r15;
        this.A0B = r14;
        this.A0D = r16;
        this.A0I = r21;
        this.A0M = AnonymousClass3MW.A0T(view, 2131434818);
        this.A0L = AnonymousClass3MW.A0T(view, 2131434817);
        this.A0K = AnonymousClass3MW.A0R(view, 2131428749);
        this.A0N = (ThumbnailButton) AnonymousClass1HF.A06(view, 2131429433);
        WaImageView A0R = AnonymousClass3MW.A0R(view, 2131429522);
        this.A05 = A0R;
        this.A0J = C42141xh.A01(view, r7, 2131434815);
        this.A02 = new PopupMenu(view.getContext(), A0R);
    }

    public static boolean A01(MenuItem menuItem, AnonymousClass8J6 r9) {
        String str;
        Context A0D2 = C108945cZ.A0D(r9);
        if (A0D2 == null) {
            str = "UpcomingActivityCallViewHolder/onPopupMenuItemClickListener context null";
        } else if (r9.A01 == null || r9.A00 == null) {
            str = "UpcomingActivityCallViewHolder/onPopupMenuItemClickListener contact and/or schedule call null";
        } else if (menuItem.getItemId() == 0) {
            A00(A0D2, r9);
            return true;
        } else {
            SpannableString A092 = AnonymousClass8BU.A09(A0D2, 2131887906);
            A092.setSpan(new ForegroundColorSpan(-65536), 0, A092.length(), 0);
            C73203Rj A002 = AnonymousClass4a6.A00(A0D2);
            A002.A0k(C17880vN.A0q(A0D2, r9.A00.A00(), new Object[1], 0, 2131895409));
            AnonymousClass8BT.A15(A0D2, A002, new Object[]{r9.A01.A0K()}, 2131895408);
            A002.A0T(true);
            AnonymousClass8BU.A1A(A002);
            A002.A0L(new C20151A9n(r9, 30), A092);
            AnonymousClass3MY.A1G(A002);
            return true;
        }
        Log.w(str);
        return false;
    }
}
