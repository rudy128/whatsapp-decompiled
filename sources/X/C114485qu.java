package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.5qu  reason: invalid class name and case insensitive filesystem */
public class C114485qu extends BV6 {
    public /* bridge */ /* synthetic */ Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        C114125qC r3 = (C114125qC) ((C110125ey) view);
        DFL dfl2 = dfl;
        r3.A00 = dfl.A0I(49, false);
        r3.onResume();
        DOZ doz2 = doz;
        C128236ff r4 = (C128236ff) C26272CwJ.A04(doz, dfl);
        AnonymousClass1FL A00 = A00(doz.A00);
        if (A00 != null) {
            r4.A00.A00 = r3;
            if (!r4.A02) {
                r4.A02 = true;
                AnonymousClass02V BVe = A00.BVe();
                C110705gv r1 = r4.A00;
                C18070vi.A0d(r1, 0);
                BVe.A06(r1);
            }
        }
        if (r4.A01 == null) {
            String str = "";
            String str2 = str;
            String A0D = dfl.A0D(38);
            if (A0D != null) {
                str2 = A0D;
            }
            String A0D2 = dfl.A0D(42);
            if (A0D2 != null) {
                str = A0D2;
            }
            if ("POST".equals(C108955ca.A0y(str))) {
                r3.setCookieStringsInsecure(str2, (Collection) null);
                r3.loadData("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>", "text/html", DefaultCrypto.UTF_8);
            } else {
                r3.A06(str2, (Map) null);
            }
        }
        r3.A01.A00 = new C132746nU(this, r3, r4, doz2, dfl2);
        return null;
    }

    public boolean A0P(Object obj, Object obj2) {
        return false;
    }

    public static AnonymousClass1FL A00(Context context) {
        if (context instanceof AnonymousClass1FL) {
            return (AnonymousClass1FL) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        C114125qC r4 = (C114125qC) ((C110125ey) view);
        r4.A01.A00 = null;
        r4.onPause();
        C110705gv r1 = ((C128236ff) C26272CwJ.A04(doz, dfl)).A00;
        r1.A00 = null;
        r1.A06(false);
        r4.stopLoading();
        r4.clearHistory();
        r4.loadData("", (String) null, (String) null);
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C114125qC r2 = new C114125qC(context);
        r2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return r2;
    }

    public C114485qu(DOZ doz, DFL dfl) {
        super(doz, dfl);
    }
}
