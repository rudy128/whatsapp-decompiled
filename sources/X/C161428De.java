package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.8De  reason: invalid class name and case insensitive filesystem */
public class C161428De extends LinearLayout implements AnonymousClass009 {
    public View A00;
    public View A01;
    public Button A02;
    public ImageView A03;
    public TextView A04;
    public AnonymousClass031 A05;
    public boolean A06;

    public void A00(int i, int i2) {
        Context context;
        int i3;
        Context context2;
        int i4;
        Resources resources;
        int i5;
        String string;
        if (i != 0) {
            if (i == 2) {
                setAlertButtonVisibility(8);
                setAlertMessageText(getContext().getString(2131887948));
                resources = getResources();
                i5 = 2131232010;
            } else if (i != 3) {
                if (i != 4) {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getContext().getString(2131897760));
                    string = getContext().getString(2131897797);
                } else {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getResources().getString(2131897760));
                    Resources resources2 = getResources();
                    if (i2 == 0) {
                        i2 = 2131897796;
                    }
                    string = resources2.getString(i2);
                }
                setAlertMessageText(string);
                resources = getResources();
                i5 = 2131232392;
            } else {
                setAlertButtonVisibility(0);
                setAlertButtonText(getContext().getString(2131895117));
                context = getContext();
                i3 = 2131887947;
                setAlertMessageText(context.getString(i3));
                setAlertIcon(getResources().getDrawable(2131232438));
                context2 = getContext();
                i4 = 2131102100;
            }
            setAlertIcon(resources.getDrawable(i5));
            context2 = getContext();
            i4 = 2131102101;
        } else {
            setAlertButtonVisibility(0);
            setAlertButtonText(getContext().getString(2131895117));
            context = getContext();
            i3 = 2131887940;
            setAlertMessageText(context.getString(i3));
            setAlertIcon(getResources().getDrawable(2131232438));
            context2 = getContext();
            i4 = 2131102100;
        }
        setAlertIconTint(C19740yt.A00(context2, i4));
    }

    private void setAlertIcon(Drawable drawable) {
        this.A03.setImageDrawable(drawable);
    }

    private void setAlertIconTint(int i) {
        AnonymousClass4aX.A0D(this.A03, i);
    }

    private void setAlertMessageText(String str) {
        this.A04.setText(str);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAlertButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setAlertButtonText(String str) {
        this.A02.setText(str);
    }

    public void setAlertButtonVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setTopDividerVisibility(int i) {
        this.A01.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        setAlertMessageText(r1.getString(r0));
        setAlertIcon(getResources().getDrawable(2131231892));
        r1 = getContext();
        r0 = 2131102100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        setAlertMessageText(getContext().getString(2131897797));
        setAlertIcon(getResources().getDrawable(2131232392));
        r1 = getContext();
        r0 = 2131102101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        setAlertIconTint(X.C19740yt.A00(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlertType(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0052;
                case -591252731: goto L_0x0042;
                case 1124965819: goto L_0x0032;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.content.Context r1 = r2.getContext()
            r0 = 2131897797(0x7f122dc5, float:1.9430494E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131232392(0x7f080688, float:1.8080892E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131102101(0x7f060995, float:1.781663E38)
        L_0x002a:
            int r0 = X.C19740yt.A00(r1, r0)
            r2.setAlertIconTint(r0)
            return
        L_0x0032:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131887947(0x7f12074b, float:1.9410515E38)
            goto L_0x0066
        L_0x0042:
            java.lang.String r0 = "EXPIRED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131893611(0x7f121d6b, float:1.9422003E38)
            goto L_0x0066
        L_0x0052:
            java.lang.String r0 = "VOIDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 8
            r2.setAlertButtonVisibility(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887940(0x7f120744, float:1.9410501E38)
        L_0x0066:
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131231892(0x7f080494, float:1.8079878E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131102100(0x7f060994, float:1.7816628E38)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161428De.setAlertType(java.lang.String):void");
    }

    public void setAlertType(int i) {
        A00(i, 0);
    }
}
