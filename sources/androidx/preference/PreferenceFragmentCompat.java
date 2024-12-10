package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass1GP;
import X.AnonymousClass1GY;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8I7;
import X.AnonymousClass8JD;
import X.AnonymousClass9UH;
import X.B4H;
import X.B4I;
import X.B6U;
import X.B6Y;
import X.C161268Cm;
import X.C17880vN;
import X.C195659th;
import X.C21466AkX;
import X.C34001jj;
import X.C38391rD;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PreferenceFragmentCompat extends Fragment implements B6U, B6Y, B4H, B4I {
    public Handler A00 = new C161268Cm(this);
    public C195659th A01;
    public RecyclerView A02;
    public boolean A03;
    public boolean A04;
    public int A05 = 2131626527;
    public final AnonymousClass8I7 A06 = new AnonymousClass8I7(this);
    public final Runnable A07 = new C21466AkX((Object) this, 10);

    public void A1s() {
        Handler handler = this.A00;
        handler.removeCallbacks(this.A07);
        handler.removeMessages(1);
        if (this.A03) {
            this.A02.setAdapter((C38391rD) null);
            PreferenceScreen preferenceScreen = this.A01.A06;
            if (preferenceScreen != null) {
                preferenceScreen.A08();
            }
        }
        this.A02 = null;
        super.A1s();
    }

    public void A20(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A01.A06;
        if (preferenceScreen != null) {
            Bundle A0D = C17880vN.A0D();
            preferenceScreen.A0B(A0D);
            bundle.putBundle("android:preferences", A0D);
        }
    }

    public void A21(Bundle bundle, View view) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen = this.A01.A06) == null)) {
            preferenceScreen.A0A(bundle2);
        }
        if (this.A03) {
            A25();
        }
        this.A04 = true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1rD, X.B4G, java.lang.Object, X.8Hv] */
    public void A25() {
        PreferenceScreen preferenceScreen = this.A01.A06;
        if (preferenceScreen != null) {
            RecyclerView recyclerView = this.A02;
            ? r2 = new C38391rD();
            r2.A02 = new C21466AkX((Object) r2, 12);
            r2.A01 = preferenceScreen;
            r2.A00 = new Handler();
            r2.A01.A09 = r2;
            r2.A04 = AnonymousClass000.A13();
            r2.A05 = AnonymousClass000.A13();
            r2.A03 = AnonymousClass000.A13();
            r2.A0K(true);
            r2.A0V();
            recyclerView.setAdapter(r2);
            preferenceScreen.A07();
        }
    }

    public Preference BLF(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C195659th r0 = this.A01;
        if (r0 == null || (preferenceScreen = r0.A06) == null) {
            return null;
        }
        return preferenceScreen.A0R(charSequence);
    }

    public boolean C1T(Preference preference) {
        String str = preference.A0I;
        if (str == null) {
            return false;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        AnonymousClass1GP supportFragmentManager = A1D().getSupportFragmentManager();
        Bundle bundle = preference.A08;
        if (bundle == null) {
            bundle = C17880vN.A0D();
            preference.A08 = bundle;
        }
        AnonymousClass1GY A0R = supportFragmentManager.A0R();
        A1D().getClassLoader();
        Fragment A002 = A0R.A00(str);
        A002.A1R(bundle);
        A002.A1V(this, 0);
        C34001jj r1 = new C34001jj(supportFragmentManager);
        r1.A09(A002, ((View) this.A0B.getParent()).getId());
        r1.A0H((String) null);
        r1.A00(false);
        return true;
    }

    public void A1j() {
        super.A1j();
        C195659th r1 = this.A01;
        r1.A05 = null;
        r1.A03 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        int i;
        TypedArray obtainStyledAttributes = A1n().obtainStyledAttributes((AttributeSet) null, AnonymousClass9UH.A07, 2130970801, 0);
        this.A05 = obtainStyledAttributes.getResourceId(0, this.A05);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A1n());
        View inflate = cloneInContext.inflate(this.A05, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!A1n().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(2131434428)) == null) {
                recyclerView = (RecyclerView) AnonymousClass3MX.A09(cloneInContext, viewGroup2, 2131626530);
                AnonymousClass3Ma.A15(A1n(), recyclerView);
                recyclerView.setAccessibilityDelegateCompat(new AnonymousClass8JD(recyclerView));
            }
            this.A02 = recyclerView;
            AnonymousClass8I7 r2 = this.A06;
            recyclerView.A0r(r2);
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            r2.A00 = i;
            r2.A01 = drawable;
            PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
            preferenceFragmentCompat.A02.A0Y();
            if (dimensionPixelSize != -1) {
                r2.A00 = dimensionPixelSize;
                preferenceFragmentCompat.A02.A0Y();
            }
            r2.A02 = z;
            if (this.A02.getParent() == null) {
                viewGroup2.addView(this.A02);
            }
            this.A00.post(this.A07);
            return inflate;
        }
        throw AnonymousClass000.A0n("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void A1v() {
        super.A1v();
        C195659th r0 = this.A01;
        r0.A05 = this;
        r0.A03 = this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016d, code lost:
        if (r0 == 0) goto L_0x016f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r8) {
        /*
            r7 = this;
            super.A1z(r8)
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            X.1FL r0 = r7.A1B()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r1 = 2130970807(0x7f0408b7, float:1.7550335E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r2 = r3.resourceId
            if (r2 != 0) goto L_0x001e
            r2 = 2132083575(0x7f150377, float:1.9807296E38)
        L_0x001e:
            X.1FL r0 = r7.A1B()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 0
            r1.applyStyle(r2, r0)
            android.content.Context r1 = r7.A1n()
            X.9th r0 = new X.9th
            r0.<init>(r1)
            r7.A01 = r0
            r0.A04 = r7
            android.os.Bundle r1 = r7.A06
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"
            r1.getString(r0)
        L_0x0040:
            r4 = r7
            boolean r0 = r7 instanceof com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment
            if (r0 == 0) goto L_0x007f
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r4 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r4
            X.1Dv r2 = X.AnonymousClass1BI.A00
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x007d
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
        L_0x005b:
            X.1BI r0 = r2.A02(r0)
            X.C17960vV.A07(r0)
            r4.A05 = r0
            X.1FL r1 = r4.A1D()
            r0 = 2131893086(0x7f121b5e, float:1.9420939E38)
            java.lang.String r1 = r1.getString(r0)
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x0076
            r0.setTitle(r1)
        L_0x0076:
            r0 = 2132279307(0x7f18000b, float:2.0204288E38)
        L_0x0079:
            r4.A27(r0)
        L_0x007c:
            return
        L_0x007d:
            r0 = 0
            goto L_0x005b
        L_0x007f:
            boolean r0 = r7 instanceof com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment
            if (r0 == 0) goto L_0x00bd
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r4 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r4
            X.1Dv r2 = X.AnonymousClass1BI.A00
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x00bb
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x00bb
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
        L_0x0099:
            X.1BI r0 = r2.A02(r0)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            r4.A02 = r0
            X.1FL r1 = r4.A1D()
            r0 = 2131886558(0x7f1201de, float:1.9407698E38)
            java.lang.String r1 = r1.getString(r0)
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x00b7
            r0.setTitle(r1)
        L_0x00b7:
            r0 = 2132279305(0x7f180009, float:2.0204284E38)
            goto L_0x0079
        L_0x00bb:
            r0 = 0
            goto L_0x0099
        L_0x00bd:
            boolean r0 = r7 instanceof com.whatsapp.settings.SettingsJidNotificationFragment
            if (r0 == 0) goto L_0x00ea
            com.whatsapp.settings.SettingsJidNotificationFragment r4 = (com.whatsapp.settings.SettingsJidNotificationFragment) r4
            X.1FL r0 = r4.A1B()
            java.lang.String r0 = X.C72453Mb.A0u(r0)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            X.C17960vV.A07(r0)
            r4.A05 = r0
            X.1FL r1 = r4.A1D()
            r0 = 2131899415(0x7f123417, float:1.9433775E38)
            java.lang.String r1 = r1.getString(r0)
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x00e6
            r0.setTitle(r1)
        L_0x00e6:
            com.whatsapp.settings.SettingsJidNotificationFragment.A00(r4)
            return
        L_0x00ea:
            com.whatsapp.settings.SettingsChatHistoryFragment r4 = (com.whatsapp.settings.SettingsChatHistoryFragment) r4
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x007c
            X.1FL r1 = r4.A1D()
            r0 = 2131895815(0x7f122607, float:1.9426474E38)
            java.lang.String r1 = r1.getString(r0)
            X.8dO r0 = r4.A00
            if (r0 == 0) goto L_0x0102
            r0.setTitle(r1)
        L_0x0102:
            r0 = 2132279304(0x7f180008, float:2.0204282E38)
            r4.A27(r0)
            X.0ve r2 = r4.A08
            r1 = 4023(0xfb7, float:5.637E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r6 = X.C18020vd.A05(r0, r2, r1)
            X.18O r1 = r4.A02
            X.18R r0 = X.AnonymousClass18O.A0h
            boolean r0 = r1.A09(r0)
            java.lang.String r2 = "email_chat_history"
            if (r0 == 0) goto L_0x0196
            X.11S r0 = r4.A01
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0196
            androidx.preference.Preference r2 = r4.BLF(r2)
            r1 = 0
            X.AHJ r0 = new X.AHJ
            r0.<init>(r4, r1)
            r2.A0B = r0
            if (r6 == 0) goto L_0x013a
            r0 = 2131232379(0x7f08067b, float:1.8080866E38)
            r2.A09(r0)
        L_0x013a:
            java.lang.String r0 = "msgstore_delete_all_chats"
            androidx.preference.Preference r5 = r4.BLF(r0)
            r1 = 1
            X.AHJ r0 = new X.AHJ
            r0.<init>(r4, r1)
            r5.A0B = r0
            java.lang.String r0 = "msgstore_clear_all_chats"
            androidx.preference.Preference r2 = r4.BLF(r0)
            r1 = 2
            X.AHJ r0 = new X.AHJ
            r0.<init>(r4, r1)
            r2.A0B = r0
            java.lang.String r2 = "msgstore_archive_all_chats"
            androidx.preference.Preference r3 = r4.BLF(r2)
            X.1Nd r0 = r4.A05
            int r1 = r0.A05()
            X.1Nd r0 = r4.A05
            int r0 = r0.A03()
            if (r1 > 0) goto L_0x016f
            r1 = 2131897263(0x7f122baf, float:1.942941E38)
            if (r0 != 0) goto L_0x0172
        L_0x016f:
            r1 = 2131898708(0x7f123154, float:1.9432341E38)
        L_0x0172:
            android.content.Context r0 = r3.A05
            java.lang.String r0 = r0.getString(r1)
            r3.A0I(r0)
            androidx.preference.Preference r2 = r4.BLF(r2)
            r1 = 3
            X.AHJ r0 = new X.AHJ
            r0.<init>(r4, r1)
            r2.A0B = r0
            if (r6 == 0) goto L_0x007c
            r0 = 2131231671(0x7f0803b7, float:1.807943E38)
            r3.A09(r0)
            r0 = 2131231845(0x7f080465, float:1.8079783E38)
            r5.A09(r0)
            return
        L_0x0196:
            X.9th r0 = r4.A01
            androidx.preference.PreferenceScreen r1 = r0.A06
            if (r1 == 0) goto L_0x013a
            androidx.preference.Preference r0 = r4.BLF(r2)
            if (r0 == 0) goto L_0x013a
            androidx.preference.PreferenceGroup.A00(r0, r1)
            r1.A06()
            goto L_0x013a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceFragmentCompat.A1z(android.os.Bundle):void");
    }
}
