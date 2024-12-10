package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.regex.Pattern;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.8CS  reason: invalid class name */
public class AnonymousClass8CS extends AsyncTask {
    public Context A00;
    public Bitmap A01;
    public String A02;

    public /* synthetic */ Object doInBackground(Object[] objArr) {
        InputStream inputStream = null;
        try {
            Pattern compile = Pattern.compile("(https)?:\\/\\/.*\\.(?:png|jpg)");
            String str = this.A02;
            if (AnonymousClass8BU.A1V(str, compile)) {
                inputStream = AnonymousClass8BV.A0v(str).getInputStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                this.A01 = decodeStream;
                if (decodeStream != null) {
                    this.A01 = Bitmap.createScaledBitmap(decodeStream, 50, 50, false);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return this.A01;
            }
            throw C17880vN.A0f("Pattern didn't match");
        } catch (IOException | MalformedURLException unused2) {
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        GetCredential getCredential;
        int i;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            getCredential = (GetCredential) this.A00;
            i = 2131428049;
            AnonymousClass3MX.A0I(getCredential, 2131428049).setImageBitmap(bitmap);
        } else {
            try {
                getCredential = (GetCredential) this.A00;
                Resources resources = getCredential.getResources();
                i = 2131428049;
                AnonymousClass3MX.A0I(getCredential, 2131428049).setImageDrawable(resources.getDrawable(resources.getIdentifier(this.A02, "drawable", getCredential.getPackageName())));
            } catch (Exception unused) {
                return;
            }
        }
        AnonymousClass3MX.A0I(getCredential, i).setVisibility(0);
    }
}
