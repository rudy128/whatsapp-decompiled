package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: X.3RP  reason: invalid class name */
public final class AnonymousClass3RP extends PopupWindow {
    public final Context A00;
    public final View A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass4VK A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final String A08;
    public final C18100vl A09 = AnonymousClass1DF.A01(new AnonymousClass5GN(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3RP(Context context, AnonymousClass118 r15, AnonymousClass4VK r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, String str) {
        super(context);
        String str2;
        String str3;
        C18070vi.A0d(context, 1);
        AnonymousClass4VK r6 = r16;
        AnonymousClass00H r5 = r17;
        String str4 = str;
        C18070vi.A0p(r6, str4, r5);
        AnonymousClass00H r4 = r18;
        C18070vi.A0d(r4, 5);
        AnonymousClass00H r3 = r19;
        AnonymousClass00H r0 = r20;
        C18070vi.A0q(r3, r0, r15);
        this.A00 = context;
        this.A03 = r6;
        this.A08 = str4;
        this.A04 = r5;
        this.A07 = r4;
        this.A05 = r3;
        this.A06 = r0;
        this.A02 = r15;
        LayoutInflater from = LayoutInflater.from(context);
        C18070vi.A0X(from);
        View A0D = AnonymousClass3MY.A0D(from, 2131625700);
        C18070vi.A0X(A0D);
        this.A01 = A0D;
        setOutsideTouchable(true);
        setFocusable(true);
        setContentView(A0D);
        setWidth(AnonymousClass3MW.A01(context.getResources(), 2131167089));
        setHeight(AnonymousClass3MW.A01(context.getResources(), 2131167087));
        Context context2 = this.A00;
        float dimension = context2.getResources().getDimension(2131167082);
        int A012 = AnonymousClass3MW.A01(context2.getResources(), 2131167083);
        int A002 = C19740yt.A00(context2, 2131099876);
        int A003 = C19740yt.A00(context2, 2131102343);
        float[] fArr = new float[8];
        fArr[0] = dimension;
        C72483Me.A19(fArr, dimension);
        ShapeDrawable A0H = C72483Me.A0H(A012, A003, A002);
        if (Build.VERSION.SDK_INT < 28) {
            this.A01.setLayerType(1, A0H.getPaint());
        }
        A0H.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A0H});
        layerDrawable.setLayerInset(0, A012, A012, A012, A012);
        setBackgroundDrawable(layerDrawable);
        TextView A0W = C72453Mb.A0W(A0D, 2131431637);
        TextView A0W2 = C72453Mb.A0W(A0D, 2131431634);
        ImageView imageView = (ImageView) AnonymousClass3MX.A0C(A0D, 2131431635);
        String str5 = this.A08;
        if (str5.length() != 0) {
            int parseInt = Integer.parseInt(str5);
            AnonymousClass210 r9 = this.A03.A00;
            if (r9.A06 != null && (str2 = r9.A07) != null) {
                Uri parse = Uri.parse(str2);
                String valueOf = String.valueOf(parse.getHost());
                Resources A0Y = AnonymousClass000.A0Y(A0D);
                Object[] A1b = AnonymousClass3MW.A1b();
                C17880vN.A1T(A1b, parseInt, 0);
                A0W.setText(AnonymousClass3MW.A0x(A0Y, r9.A06, A1b, 1, 2131886623));
                A0W2.setText(valueOf);
                C692136i A004 = AnonymousClass2UX.A00(r9);
                if (!(A004 == null || (str3 = A004.A03) == null)) {
                    ((AnonymousClass4VT) this.A09.getValue()).A02(imageView, new C97994qO(imageView, 2), str3);
                }
                A0D.setOnClickListener(new C90074dU(parse, A0D, 2));
            }
        }
    }
}
