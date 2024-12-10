package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;

public class BIC extends FrameLayout {
    public final C26110CsV A00;

    public void A01() {
        C26110CsV csV = this.A00;
        C28451E1r e1r = csV.A01;
        if (e1r != null) {
            try {
                C26399Cyz.A03((C26399Cyz) ((DJ4) e1r).A02, 5);
            } catch (RemoteException e) {
                throw C27226Da5.A00(e);
            }
        } else {
            C26110CsV.A01(csV, 1);
        }
    }

    public void A02() {
        C28451E1r e1r = this.A00.A01;
        if (e1r != null) {
            try {
                C26399Cyz.A03((C26399Cyz) ((DJ4) e1r).A02, 6);
            } catch (RemoteException e) {
                throw C27226Da5.A00(e);
            }
        }
    }

    public void A03() {
        C26110CsV csV = this.A00;
        C28451E1r e1r = csV.A01;
        if (e1r != null) {
            try {
                C26399Cyz.A03((C26399Cyz) ((DJ4) e1r).A02, 4);
            } catch (RemoteException e) {
                throw C27226Da5.A00(e);
            }
        } else {
            C26110CsV.A01(csV, 5);
        }
    }

    public void A04() {
        C26110CsV csV = this.A00;
        C26110CsV.A00((Bundle) null, new DJ6(csV), csV);
    }

    public void A06(Bundle bundle) {
        C26110CsV csV = this.A00;
        C28451E1r e1r = csV.A01;
        if (e1r != null) {
            DJ4 dj4 = (DJ4) e1r;
            try {
                Bundle A0D = C17880vN.A0D();
                C26061Cra.A01(bundle, A0D);
                C26399Cyz cyz = (C26399Cyz) dj4.A02;
                Parcel A05 = cyz.A05(7, C26399Cyz.A01(A0D, cyz));
                if (A05.readInt() != 0) {
                    A0D.readFromParcel(A05);
                }
                A05.recycle();
                C26061Cra.A01(A0D, bundle);
            } catch (RemoteException e) {
                throw C27226Da5.A00(e);
            }
        } else {
            Bundle bundle2 = csV.A00;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
    }

    public void A07(C28516E5a e5a) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C18210vx.A02(e5a, "callback must not be null.");
            C26110CsV csV = this.A00;
            C28451E1r e1r = csV.A01;
            if (e1r != null) {
                ((DJ4) e1r).A00(e5a);
            } else {
                csV.A07.add(e5a);
            }
        } else {
            throw AnonymousClass000.A0n("getMapAsync() must be called on the main thread");
        }
    }

    public BIC(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.A00 = new C26110CsV(context, this, googleMapOptions);
        setClickable(true);
    }

    public void A05(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            C26110CsV csV = this.A00;
            C26110CsV.A00(bundle, new DJ7(bundle, csV), csV);
            if (csV.A01 == null) {
                C41381wH r3 = C41381wH.A00;
                Context context = getContext();
                int A02 = r3.A02(context, 12451000);
                String A01 = C63692tX.A01(context, A02);
                Resources resources = context.getResources();
                int i = 2131898791;
                if (A02 != 1) {
                    i = 2131898798;
                    if (A02 != 2) {
                        i = 2131898788;
                        if (A02 != 3) {
                            i = 17039370;
                        }
                    }
                }
                String string = resources.getString(i);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                C108965cb.A12(linearLayout, -2);
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                C108965cb.A12(textView, -2);
                textView.setText(A01);
                linearLayout.addView(textView);
                Intent A03 = r3.A03(context, (String) null, A02);
                if (A03 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    C108965cb.A12(button, -2);
                    button.setText(string);
                    linearLayout.addView(button);
                    button.setOnClickListener(new AnonymousClass78Q(context, A03, 1));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
