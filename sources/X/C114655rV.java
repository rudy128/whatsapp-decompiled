package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5rV  reason: invalid class name and case insensitive filesystem */
public abstract class C114655rV extends AnonymousClass6G0 {
    public LinearLayout A00;
    public TextView A01;
    public AnonymousClass1LU A02;
    public ViewGroup A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.5rq, X.6nW, java.lang.Object] */
    public C114705rq A4c() {
        ? obj = new Object();
        AnonymousClass78Q r2 = new AnonymousClass78Q((Object) this, (Object) obj, 11);
        obj.A00 = A4b();
        obj.A00(r2, getString(2131889049), 2131231835);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.6nW, java.lang.Object, X.5rs] */
    public C114725rs A4d() {
        ? obj = new Object();
        AnonymousClass78Q r3 = new AnonymousClass78Q((Object) this, (Object) obj, 10);
        if (!(this instanceof CallLinkActivity)) {
            this.A00.setOnClickListener(new AnonymousClass48j(obj, r3, this, 1));
            AnonymousClass3MW.A1Q(this.A00);
            AnonymousClass3MY.A0w(this, this.A00, 2131896095);
        }
        obj.A00 = A4b();
        obj.A00(r3, getString(2131896095), 2131232294);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.5rr, X.6nW, java.lang.Object] */
    public C114715rr A4e() {
        ? obj = new Object();
        AnonymousClass78Q r3 = new AnonymousClass78Q((Object) this, (Object) obj, 12);
        String string = getString(2131899103);
        obj.A00 = A4b();
        obj.A00(r3, C72473Md.A0j(this, string, 2131896097), 2131231930);
        return obj;
    }

    public void A4g(C114725rs r4) {
        Log.i("sharelinkactivity/sharelink/");
        if (!TextUtils.isEmpty(r4.A02)) {
            Intent A0G = C108945cZ.A0G("android.intent.action.SEND");
            A0G.putExtra("android.intent.extra.TEXT", r4.A02);
            if (!TextUtils.isEmpty(r4.A01)) {
                A0G.putExtra("android.intent.extra.SUBJECT", r4.A01);
            }
            A0G.setType("text/plain");
            A0G.addFlags(524288);
            startActivity(Intent.createChooser(A0G, r4.A00));
        }
    }

    public void A4h(C114715rr r2) {
        Log.i("sharelinkactivity/sendlink/");
        if (!TextUtils.isEmpty(r2.A00)) {
            startActivity(AnonymousClass1LU.A1J(this, r2.A00));
        }
    }

    public View A4b() {
        View inflate = View.inflate(this, 2131626945, (ViewGroup) null);
        ViewGroup viewGroup = this.A03;
        C17960vV.A05(viewGroup);
        viewGroup.addView(inflate);
        return inflate;
    }

    public void A4f() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, 2132083647);
        View view = new View(contextThemeWrapper, (AttributeSet) null, 2132083647);
        view.setLayoutParams(new LinearLayout.LayoutParams(contextThemeWrapper, (AttributeSet) null));
        ViewGroup viewGroup = this.A03;
        C17960vV.A05(viewGroup);
        viewGroup.addView(view);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131626944);
        C72463Mc.A0S(this, AnonymousClass3Ma.A0G(this)).A0W(true);
        this.A03 = (ViewGroup) C110885hR.A0A(this, 2131435370);
        LayoutInflater layoutInflater = getLayoutInflater();
        if (this instanceof AnonymousClass687) {
            i = 2131625739;
        } else {
            i = 2131625740;
        }
        layoutInflater.inflate(i, this.A03, true);
        this.A01 = (TextView) C110885hR.A0A(this, 2131431999);
        this.A00 = (LinearLayout) C110885hR.A0A(this, 2131432010);
    }
}
