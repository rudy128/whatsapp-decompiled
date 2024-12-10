package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import org.json.JSONException;

/* renamed from: X.5qF  reason: invalid class name and case insensitive filesystem */
public class C114155qF extends C136966uh implements C1593284c {
    public C132746nU A00;

    @Deprecated
    public void A04(WebView webView, int i, String str, String str2) {
        C132746nU r0;
        super.A04(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23 && (r0 = this.A00) != null) {
            r0.A00(i, str, str2);
        }
    }

    public void A05(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.A05(webView, webResourceRequest, webResourceError);
        C132746nU r3 = this.A00;
        if (r3 != null) {
            r3.A00(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void A06(WebView webView, String str) {
        super.A06(webView, str);
        C132746nU r4 = this.A00;
        if (r4 != null) {
            DFL dfl = r4.A04;
            String str2 = "";
            String A0D = dfl.A0D(38);
            if (A0D != null) {
                str2 = A0D;
            }
            String str3 = "";
            String A0D2 = dfl.A0D(41);
            if (A0D2 != null) {
                str3 = A0D2;
            }
            String str4 = "";
            String A0D3 = dfl.A0D(42);
            if (A0D3 != null) {
                str4 = A0D3;
            }
            if ("POST".equals(str4) && !"".equals(str3) && str.contains("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>")) {
                try {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    A1a[0] = C17880vN.A15().put("inlineUrl", str2).put("bodyParams", str3).toString();
                    r4.A01.evaluateJavascript(String.format("post(%s)", A1a), (ValueCallback) null);
                } catch (JSONException e) {
                    C25913CoX.A02("json exception body params needs to be in json format", e);
                }
            }
            C128236ff r1 = r4.A02;
            r1.A01 = str;
            if (r1.A02) {
                r1.A00.A06(r4.A01.canGoBack());
            }
            E8A A0A = dfl.A0A(52);
            if (A0A != null) {
                C26209Cul.A01(r4.A03, dfl, C108985cd.A0K(str), A0A);
            }
        }
    }

    public void A07(WebView webView, String str, Bitmap bitmap) {
        super.A07(webView, str, bitmap);
        C132746nU r7 = this.A00;
        if (r7 != null) {
            DFL dfl = r7.A04;
            E8A A0A = dfl.A0A(51);
            if (A0A != null) {
                C26209Cul.A01(r7.A03, dfl, C108985cd.A0K(str), A0A);
            }
            if (dfl.A0I(44, true)) {
                E8A A0A2 = dfl.A0A(36);
                C128236ff r2 = r7.A02;
                if (!str.equals(r2.A01) && A0A2 != null) {
                    C26209Cul.A01(r7.A03, dfl, C108985cd.A0K(str), A0A2);
                }
                E8A A0A3 = dfl.A0A(48);
                if (!str.equals(r2.A01) && A0A3 != null) {
                    C20046A4p a4p = new C20046A4p();
                    a4p.A03(str, 0);
                    DOZ doz = r7.A03;
                    a4p.A03(doz, 1);
                    C26209Cul.A01(doz, dfl, new C199029zJ(a4p.A00), A0A3);
                }
            }
        }
    }
}
