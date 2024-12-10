package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.WaImageView;

/* renamed from: X.3ZR  reason: invalid class name */
public class AnonymousClass3ZR extends C42011xT {
    public View A00;
    public TextView A01;
    public TextView A02;
    public AppCompatRadioButton A03;
    public AppCompatRadioButton A04;
    public WaImageView A05;
    public final /* synthetic */ C73613Wq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZR(View view, C73613Wq r4) {
        super(view);
        this.A06 = r4;
        View view2 = this.A0H;
        this.A05 = AnonymousClass3MW.A0S(view2, 2131431526);
        this.A03 = (AppCompatRadioButton) view2.findViewById(2131434310);
        this.A02 = C17880vN.A0E(view2, 2131436208);
        this.A01 = C17880vN.A0E(view2, 2131429927);
        this.A04 = (AppCompatRadioButton) view2.findViewById(2131434718);
        this.A00 = view2.findViewById(2131430073);
        this.A03.setClickable(false);
        this.A04.setClickable(false);
    }
}
