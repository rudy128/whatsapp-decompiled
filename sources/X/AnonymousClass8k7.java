package X;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.8k7  reason: invalid class name */
public abstract class AnonymousClass8k7 extends C166778dx implements C22538BBv, B7W {
    public C56382hN A00;
    public A71 A01;
    public B7X A02;
    public C184039aJ A03;
    public BloksDialogFragment A04;
    public CXN A05;
    public AnonymousClass18K A06;
    public AnonymousClass198 A07;
    public Map A08;
    public AnonymousClass00H A09 = C221618v.A00(AnonymousClass16R.class);
    public final C19974A1j A0A = new C19974A1j();

    public static void A03(Intent intent, String str, String str2) {
        HashMap hashMap;
        Serializable serializableExtra = intent.getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = C17880vN.A11();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put(str, str2);
        intent.putExtra("screen_params", hashMap);
    }

    public B7X A4b() {
        C184039aJ r2 = this.A03;
        C19974A1j a1j = this.A0A;
        AnonymousClass11P r9 = this.A05;
        AnonymousClass1KB r4 = this.A05;
        AnonymousClass11S r5 = this.A02;
        AnonymousClass18K r11 = this.A06;
        AnonymousClass11C r8 = this.A08;
        C18000vb r10 = this.A00;
        r2.A00 = new AOZ(a1j, r2, new C191649mw(r4, r5, (AnonymousClass16R) this.A09.get(), this.A01, r8, r9, r10, r11));
        return this.A03.A00;
    }

    public void A4c() {
        String str = C180529Mx.A00;
        if (str == null) {
            str = getIntent().getStringExtra("screen_name");
        }
        if (!TextUtils.isEmpty(str)) {
            this.A04 = BloksDialogFragment.A00(str, C180529Mx.A01);
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A09(this.A04, 2131428247);
            A0H.A00(false);
        }
    }

    public void onBackPressed() {
        C19974A1j a1j = this.A0A;
        HashMap hashMap = a1j.A01;
        C194839sN r1 = (C194839sN) hashMap.get("backpress");
        if (r1 != null) {
            r1.A00("on_success");
            return;
        }
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.A0K() <= 1) {
            setResult(0, C123626Ve.A00(getIntent()));
            C180529Mx.A00 = null;
            C180529Mx.A01 = null;
            finish();
            return;
        }
        supportFragmentManager.A0b();
        supportFragmentManager.A0Z();
        C19974A1j.A00(hashMap);
        Stack stack = a1j.A02;
        stack.pop();
        AnonymousClass1GP supportFragmentManager2 = getSupportFragmentManager();
        this.A04 = BloksDialogFragment.A00(((C34001jj) supportFragmentManager2.A0S(supportFragmentManager2.A0K() - 1)).A0A, (HashMap) stack.peek());
        C34001jj r2 = new C34001jj(supportFragmentManager);
        r2.A09(this.A04, 2131428247);
        r2.A00(false);
    }

    public void onCreate(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("screen_params");
        C19974A1j a1j = this.A0A;
        C19974A1j.A00(a1j.A01);
        a1j.A02.add(C17880vN.A11());
        if (serializableExtra != null) {
            a1j.A02((Map) serializableExtra);
        }
        super.onCreate(bundle);
        try {
            this.A07.A00();
        } catch (IOException unused) {
        }
        setContentView(2131624021);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        A0G.A0L();
        C003401n A0K = AnonymousClass3MY.A0K(this, A0G);
        if (A0K != null) {
            AnonymousClass8BV.A17(A0K, "");
        }
        C74743cP A002 = AnonymousClass3NL.A00(this, this.A00, 2131231675);
        A002.setColorFilter(AnonymousClass3Ma.A01(this, getResources(), 2130970284, 2131101275), PorterDuff.Mode.SRC_ATOP);
        A0G.setNavigationIcon((Drawable) A002);
        A0G.setNavigationOnClickListener(new AFB(this, 33));
    }

    public void onDestroy() {
        super.onDestroy();
        C19974A1j a1j = this.A0A;
        Iterator it = a1j.A02.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        C19974A1j.A00(a1j.A01);
        a1j.A00.A01.clear();
    }

    public void onPause() {
        super.onPause();
        this.A0A.A03(false);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C19974A1j a1j = this.A0A;
        ArrayList arrayList = (ArrayList) bundle.getSerializable("screen_manager_saved_state");
        if (arrayList != null) {
            Stack stack = a1j.A02;
            stack.clear();
            stack.addAll(arrayList);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A02 == null) {
            this.A02 = A4b();
        }
        this.A05.A00(getApplicationContext(), this.A02.BM4(), this.A00.A00(this, getSupportFragmentManager(), new C197609wy(this.A08)));
        this.A0A.A03(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Stack stack = this.A0A.A02;
        if (!stack.isEmpty()) {
            ArrayList A0g = C108975cc.A0g(stack);
            Iterator it = stack.iterator();
            while (it.hasNext()) {
                A0g.add(new HashMap((Map) it.next()));
            }
            bundle.putSerializable("screen_manager_saved_state", A0g);
        }
    }
}
