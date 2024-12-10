package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.community.NewCommunityActivity;

/* renamed from: X.3pI  reason: invalid class name and case insensitive filesystem */
public abstract class C77063pI extends C75123e2 {
    public int A00 = 1;
    public View.OnClickListener A01;
    public View A02;
    public ImageView A03;
    public ScrollView A04;
    public AnonymousClass1YQ A05;
    public TextInputLayout A06;
    public WaEditText A07;
    public WaEditText A08;
    public C24791Lr A09;
    public C27191Vc A0A;
    public AnonymousClass1VU A0B;
    public C18010vc A0C;
    public C27071Up A0D;
    public AnonymousClass00H A0E = C221618v.A00(AnonymousClass17C.class);
    public AnonymousClass00H A0F;
    public final View.OnFocusChangeListener A0G = new C90134da(this, 1);
    public final ViewTreeObserver.OnGlobalLayoutListener A0H = new C90584eJ((Object) this, 13);

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131624078);
        this.A02 = findViewById(2131432979);
        this.A03 = (ImageView) C110885hR.A0A(this, 2131431496);
        this.A08 = (WaEditText) C110885hR.A0A(this, 2131431270);
        this.A07 = (WaEditText) C110885hR.A0A(this, 2131429227);
        this.A05 = (AnonymousClass1YQ) C110885hR.A0A(this, 2131432955);
        setSupportActionBar(AnonymousClass3Ma.A0G(this));
        boolean z = this instanceof NewCommunityActivity;
        C003401n A0J = AnonymousClass3MY.A0J(this);
        A0J.A0Y(true);
        if (z) {
            A0J.A0W(true);
            i = 2131892456;
        } else {
            A0J.A0W(true);
            i = 2131889609;
        }
        A0J.A0M(i);
        ImageView imageView = this.A03;
        AnonymousClass1VU r5 = this.A0B;
        C72473Md.A0t(getTheme(), getResources(), imageView, new C65482wZ(0), r5);
        C89894dC r3 = new C89894dC(this, 21);
        this.A01 = r3;
        this.A03.setOnClickListener(r3);
        int max = Math.max(0, this.A06.A04(AnonymousClass18O.A1O));
        TextInputLayout textInputLayout = (TextInputLayout) C110885hR.A0A(this, 2131432912);
        this.A06 = textInputLayout;
        textInputLayout.setCounterEnabled(true);
        this.A06.setCounterMaxLength(max);
        this.A06.A0K = new C91904gR(1);
        AnonymousClass48E.A00(this.A08, this, 3);
        C72453Mb.A1H(this.A08, new InputFilter[1], max, 0);
        ((TextInputLayout) C110885hR.A0A(this, 2131432912)).setHint((CharSequence) getString(2131888538));
        this.A07 = (WaEditText) C110885hR.A0A(this, 2131429227);
        this.A04 = (ScrollView) C110885hR.A0A(this, 2131432956);
        int max2 = Math.max(0, this.A06.A04(AnonymousClass18O.A1V));
        TextView A0L = AnonymousClass3MX.A0L(this, 2131429934);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131429936);
        A0L2.setVisibility(8);
        this.A07.setHint(2131888519);
        C18030ve r4 = this.A0E;
        AnonymousClass1KW r15 = this.A0D;
        AnonymousClass11C r12 = this.A08;
        C18000vb r13 = this.A00;
        C18010vc r32 = this.A0C;
        C83774Gp.A00(this, this.A04, A0L, A0L2, this.A07, r12, r13, this.A0C, r15, r4, r32, max2);
        C18030ve r42 = this.A0E;
        AnonymousClass1KW r152 = this.A0D;
        AnonymousClass11C r122 = this.A08;
        C18000vb r132 = this.A00;
        C18010vc r33 = this.A0C;
        this.A07.addTextChangedListener(new AnonymousClass488(this.A07, (TextView) null, r122, r132, this.A0C, r152, r42, r33, max2, 0, true));
        if (z) {
            AnonymousClass3NL.A01(this, this.A05, this.A00, 2131231900);
            this.A05.setOnClickListener(new AnonymousClass48m(this, 9));
        } else {
            AnonymousClass3MX.A1B(this, this.A05, 2131231807);
            AnonymousClass48l.A00(this.A05, this, 49);
        }
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A0H);
        WaEditText waEditText = this.A07;
        View.OnFocusChangeListener onFocusChangeListener = this.A0G;
        waEditText.setOnFocusChangeListener(onFocusChangeListener);
        this.A08.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void A4b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A06.setError((CharSequence) null);
            return;
        }
        this.A06.setError(str);
        this.A06.requestFocus();
        this.A04.smoothScrollTo(0, this.A06.getTop());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
