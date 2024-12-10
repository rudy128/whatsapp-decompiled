package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaTextView;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.5nB  reason: invalid class name and case insensitive filesystem */
public class C113495nB extends C42011xT {
    public C112345lK A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final LinearLayout A09;
    public final ProgressBar A0A;
    public final ProgressBar A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final GridLayoutManager A0F;
    public final RecyclerView A0G;
    public final CircularProgressBar A0H;
    public final WaTextView A0I;
    public final /* synthetic */ StickerStoreTabFragment A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113495nB(View view, StickerStoreTabFragment stickerStoreTabFragment) {
        super(view);
        this.A0J = stickerStoreTabFragment;
        this.A02 = view;
        this.A0E = C17880vN.A0E(view, 2131435752);
        this.A0C = C17880vN.A0E(view, 2131435739);
        this.A0D = C17880vN.A0E(view, 2131435743);
        this.A06 = AnonymousClass3MW.A0H(view, 2131428610);
        this.A07 = AnonymousClass3MW.A0H(view, 2131428622);
        this.A08 = AnonymousClass3MW.A0G(view, 2131435740);
        this.A0A = (ProgressBar) view.findViewById(2131433384);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131435763);
        this.A0G = A0Q;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), stickerStoreTabFragment.A00);
        this.A0F = gridLayoutManager;
        gridLayoutManager.A1Z(1);
        A0Q.setLayoutManager(gridLayoutManager);
        this.A01 = view.findViewById(2131428480);
        this.A04 = view.findViewById(2131435779);
        WaTextView A0U = AnonymousClass3MW.A0U(view, 2131435780);
        this.A0I = A0U;
        this.A0B = (ProgressBar) view.findViewById(2131433393);
        this.A0H = (CircularProgressBar) view.findViewById(2131435762);
        this.A03 = view.findViewById(2131432981);
        this.A05 = AnonymousClass3MW.A0H(view, 2131435723);
        this.A09 = (LinearLayout) view.findViewById(2131436338);
        C43421zm.A04(A0U);
    }
}
