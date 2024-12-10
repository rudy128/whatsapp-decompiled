package androidx.preference;

import X.AFA;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03S;
import X.AnonymousClass1FL;
import X.AnonymousClass4Yv;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.B4G;
import X.B4H;
import X.B6V;
import X.B6W;
import X.B6X;
import X.B6Y;
import X.C161608Gm;
import X.C161808Hv;
import X.C17900vP;
import X.C195659th;
import X.C26228CvK;
import X.C63882tq;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment;
import com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1;
import java.util.List;

public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Context A05;
    public Intent A06;
    public Drawable A07;
    public Bundle A08;
    public B4G A09;
    public B6V A0A;
    public B6W A0B;
    public B6X A0C;
    public PreferenceGroup A0D;
    public C195659th A0E;
    public CharSequence A0F;
    public Object A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public AFA A0V;
    public CharSequence A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final View.OnClickListener A0d;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public void A0C(Parcelable parcelable) {
        this.A0L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw AnonymousClass000.A0k("Wrong state class -- expecting Preference State");
        }
    }

    @Deprecated
    public void A0E(C26228CvK cvK) {
    }

    public static void A03(Preference preference) {
        C195659th r0;
        PreferenceScreen preferenceScreen;
        Preference A0R2;
        List list;
        String str = preference.A0H;
        if (str != null && (r0 = preference.A0E) != null && (preferenceScreen = r0.A06) != null && (A0R2 = preferenceScreen.A0R(str)) != null && (list = A0R2.A0K) != null) {
            list.remove(preference);
        }
    }

    public CharSequence A04() {
        B6X b6x = this.A0C;
        if (b6x != null) {
            return b6x.CCs(this);
        }
        return this.A0W;
    }

    public void A05() {
        B4G b4g = this.A09;
        if (b4g != null) {
            C161808Hv r1 = (C161808Hv) b4g;
            int indexOf = r1.A05.indexOf(this);
            if (indexOf != -1) {
                r1.A01.A04(this, indexOf, 1);
            }
        }
    }

    public void A06() {
        B4G b4g = this.A09;
        if (b4g != null) {
            C161808Hv r0 = (C161808Hv) b4g;
            Handler handler = r0.A00;
            Runnable runnable = r0.A02;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void A07() {
        PreferenceScreen preferenceScreen;
        Preference A0R2;
        String str = this.A0H;
        if (!TextUtils.isEmpty(str)) {
            C195659th r0 = this.A0E;
            if (r0 == null || (preferenceScreen = r0.A06) == null || (A0R2 = preferenceScreen.A0R(str)) == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Dependency \"");
                A10.append(str);
                A10.append("\" not found for preference \"");
                A10.append(this.A0J);
                A10.append("\" (title: \"");
                A10.append(this.A0F);
                throw AnonymousClass000.A0o("\"", A10);
            }
            List list = A0R2.A0K;
            if (list == null) {
                list = AnonymousClass000.A13();
                A0R2.A0K = list;
            }
            list.add(this);
            boolean A0P2 = A0R2.A0P();
            if (this.A0N == A0P2) {
                this.A0N = !A0P2;
                AnonymousClass8BV.A19(this);
            }
        }
    }

    public void A08() {
        if (this instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) this;
            A03(preferenceGroup);
            preferenceGroup.A02 = false;
            List list = preferenceGroup.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).A08();
            }
            return;
        }
        A03(this);
    }

    public void A09(int i) {
        Drawable A012 = AnonymousClass03S.A01(this.A05, i);
        if (this.A07 != A012) {
            this.A07 = A012;
            this.A00 = 0;
            A05();
        }
        this.A00 = i;
    }

    public void A0A(Bundle bundle) {
        Parcelable parcelable;
        if (AnonymousClass8BR.A1S(this.A0J) && (parcelable = bundle.getParcelable(this.A0J)) != null) {
            this.A0L = false;
            A0C(parcelable);
            if (!this.A0L) {
                throw AnonymousClass000.A0n("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Gr, X.8D1] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.8D1, X.8Gs] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.8D1, X.8Gt] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.8D1, X.8Gu] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.8D1, X.8Gw] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.8D1, X.8Gv] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0J
            boolean r0 = X.AnonymousClass8BR.A1S(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r4.A0L = r0
            r2 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0031
            androidx.preference.TwoStatePreference r2 = (androidx.preference.TwoStatePreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.8Gv r1 = new X.8Gv
            r1.<init>((android.os.Parcelable) r3)
            boolean r0 = r2.A02
            r1.A00 = r0
        L_0x0024:
            r3 = r1
        L_0x0025:
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x00ba
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = r4.A0J
            r5.putParcelable(r0, r3)
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r4 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x0052
            androidx.preference.SeekBarPreference r2 = (androidx.preference.SeekBarPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.8Gw r1 = new X.8Gw
            r1.<init>((android.os.Parcelable) r3)
            int r0 = r2.A03
            r1.A02 = r0
            int r0 = r2.A01
            r1.A01 = r0
            int r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0052:
            boolean r0 = r4 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x0067
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r1 = android.view.AbsSavedState.EMPTY_STATE
            int r0 = r2.A00
            X.8Gu r3 = new X.8Gu
            r3.<init>((android.os.Parcelable) r1)
            r3.A00 = r0
            goto L_0x0025
        L_0x0067:
            boolean r0 = r4 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0080
            androidx.preference.MultiSelectListPreference r2 = (androidx.preference.MultiSelectListPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.8Gt r1 = new X.8Gt
            r1.<init>((android.os.Parcelable) r3)
            java.util.Set r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0080:
            boolean r0 = r4 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L_0x0099
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.8Gs r1 = new X.8Gs
            r1.<init>((android.os.Parcelable) r3)
            java.lang.String r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0099:
            boolean r0 = r4 instanceof androidx.preference.EditTextPreference
            if (r0 == 0) goto L_0x00b3
            androidx.preference.EditTextPreference r2 = (androidx.preference.EditTextPreference) r2
            r0 = 1
            r2.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x0025
            X.8Gr r1 = new X.8Gr
            r1.<init>((android.os.Parcelable) r3)
            java.lang.String r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x00b3:
            r0 = 1
            r4.A0L = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            goto L_0x0025
        L_0x00ba:
            java.lang.String r0 = "Derived class did not call super.onSaveInstanceState()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0B(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C195659th r5) {
        /*
            r4 = this;
            r4.A0E = r5
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0015
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x0010 }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x0010 }
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            throw r0
        L_0x0013:
            r4.A04 = r2
        L_0x0015:
            boolean r0 = r4.A0Q()
            if (r0 == 0) goto L_0x00d7
            X.9th r0 = r4.A0E
            if (r0 == 0) goto L_0x00d4
            android.content.SharedPreferences r1 = r0.A01()
        L_0x0023:
            java.lang.String r0 = r4.A0J
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00d7
            r3 = 0
        L_0x002c:
            r2 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0053
            androidx.preference.TwoStatePreference r2 = (androidx.preference.TwoStatePreference) r2
            if (r3 != 0) goto L_0x0039
            java.lang.Boolean r3 = X.AnonymousClass000.A0h()
        L_0x0039:
            boolean r3 = X.AnonymousClass000.A1Y(r3)
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x004f
            X.9th r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            boolean r3 = r1.getBoolean(r0, r3)
        L_0x004f:
            r2.A0S(r3)
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = r4 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x007a
            androidx.preference.SeekBarPreference r2 = (androidx.preference.SeekBarPreference) r2
            if (r3 != 0) goto L_0x005f
            java.lang.Integer r3 = X.AnonymousClass3MY.A0f()
        L_0x005f:
            int r3 = X.AnonymousClass000.A0M(r3)
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0075
            X.9th r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            int r3 = r1.getInt(r0, r3)
        L_0x0075:
            r0 = 1
            androidx.preference.SeekBarPreference.A00(r2, r3, r0)
            return
        L_0x007a:
            boolean r0 = r4 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0098
            androidx.preference.MultiSelectListPreference r2 = (androidx.preference.MultiSelectListPreference) r2
            java.util.Set r3 = (java.util.Set) r3
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0094
            X.9th r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            java.util.Set r3 = r1.getStringSet(r0, r3)
        L_0x0094:
            r2.A0R(r3)
            return
        L_0x0098:
            boolean r0 = r4 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L_0x00b6
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x00b2
            X.9th r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            java.lang.String r3 = r1.getString(r0, r3)
        L_0x00b2:
            r2.A0S(r3)
            return
        L_0x00b6:
            boolean r0 = r4 instanceof androidx.preference.EditTextPreference
            if (r0 == 0) goto L_0x0052
            androidx.preference.EditTextPreference r2 = (androidx.preference.EditTextPreference) r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x00d0
            X.9th r0 = r2.A0E
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = r2.A0J
            java.lang.String r3 = r1.getString(r0, r3)
        L_0x00d0:
            r2.A0R(r3)
            return
        L_0x00d4:
            r1 = 0
            goto L_0x0023
        L_0x00d7:
            java.lang.Object r3 = r4.A0G
            if (r3 == 0) goto L_0x0052
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0F(X.9th):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r0 != null) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass8J3 r9) {
        /*
            r8 = this;
            android.view.View r4 = r9.A0H
            android.view.View$OnClickListener r0 = r8.A0d
            r4.setOnClickListener(r0)
            r0 = 0
            r4.setId(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r6 = r9.A0B(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5 = 0
            r2 = 8
            r3 = 0
            if (r6 == 0) goto L_0x0106
            java.lang.CharSequence r1 = r8.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0103
            r6.setText(r1)
            r6.setVisibility(r5)
            int r0 = r6.getCurrentTextColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r6 = r9.A0B(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0067
            java.lang.CharSequence r1 = r8.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fe
            r6.setText(r1)
            r6.setVisibility(r5)
            boolean r0 = r8.A0a
            if (r0 == 0) goto L_0x0054
            boolean r0 = r8.A0c
            r6.setSingleLine(r0)
        L_0x0054:
            boolean r0 = r8.A0T
            if (r0 != 0) goto L_0x0067
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x0067
            if (r7 == 0) goto L_0x0067
            int r0 = r7.intValue()
            r6.setTextColor(r0)
        L_0x0067:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r9.A0B(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0092
            int r1 = r8.A00
            if (r1 != 0) goto L_0x007a
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x008b
        L_0x007a:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 != 0) goto L_0x0088
            android.content.Context r0 = r8.A05
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r0, r1)
            r8.A07 = r0
            if (r0 == 0) goto L_0x008b
        L_0x0088:
            r6.setImageDrawable(r0)
        L_0x008b:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00f3
            r6.setVisibility(r5)
        L_0x0092:
            r0 = 2131431503(0x7f0b104f, float:1.8484737E38)
            android.view.View r1 = r9.A0B(r0)
            if (r1 != 0) goto L_0x00a4
            r0 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.A0B(r0)
            if (r1 == 0) goto L_0x00ab
        L_0x00a4:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00ea
            r1.setVisibility(r5)
        L_0x00ab:
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r8.A0O()
            r8.A02(r4, r0)
        L_0x00b6:
            boolean r2 = r8.A0T
            r4.setFocusable(r2)
            r4.setClickable(r2)
            boolean r0 = r8.A0X
            r9.A00 = r0
            boolean r0 = r8.A0Y
            r9.A01 = r0
            boolean r1 = r8.A0M
            if (r1 == 0) goto L_0x00e3
            X.AFA r0 = r8.A0V
            if (r0 != 0) goto L_0x00d5
            X.AFA r0 = new X.AFA
            r0.<init>(r8)
            r8.A0V = r0
        L_0x00d5:
            r4.setOnCreateContextMenuListener(r0)
            r4.setLongClickable(r1)
            if (r1 == 0) goto L_0x00e2
            if (r2 != 0) goto L_0x00e2
            r4.setBackground(r3)
        L_0x00e2:
            return
        L_0x00e3:
            r0 = r3
            goto L_0x00d5
        L_0x00e5:
            r0 = 1
            r8.A02(r4, r0)
            goto L_0x00b6
        L_0x00ea:
            boolean r0 = r8.A0P
            if (r0 == 0) goto L_0x00ef
            r2 = 4
        L_0x00ef:
            r1.setVisibility(r2)
            goto L_0x00ab
        L_0x00f3:
            boolean r1 = r8.A0P
            r0 = 8
            if (r1 == 0) goto L_0x00fa
            r0 = 4
        L_0x00fa:
            r6.setVisibility(r0)
            goto L_0x0092
        L_0x00fe:
            r6.setVisibility(r2)
            goto L_0x0067
        L_0x0103:
            r6.setVisibility(r2)
        L_0x0106:
            r7 = r3
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0G(X.8J3):void");
    }

    public void A0H(CharSequence charSequence) {
        if (this.A0C != null) {
            throw AnonymousClass000.A0n("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.A0W, charSequence)) {
            this.A0W = charSequence;
            A05();
        }
    }

    public void A0I(CharSequence charSequence) {
        CharSequence charSequence2 = this.A0F;
        if (charSequence == null) {
            if (charSequence2 == null) {
                return;
            }
        } else if (charSequence.equals(charSequence2)) {
            return;
        }
        this.A0F = charSequence;
        A05();
    }

    public void A0J(String str) {
        this.A0J = str;
        if (this.A0S && !AnonymousClass8BR.A1S(str)) {
            if (!TextUtils.isEmpty(this.A0J)) {
                this.A0S = true;
                return;
            }
            throw AnonymousClass000.A0n("Preference does not have a key assigned.");
        }
    }

    public void A0L(boolean z) {
        List list = this.A0K;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (preference.A0N == z) {
                    preference.A0N = !z;
                    AnonymousClass8BV.A19(preference);
                }
            }
        }
    }

    public void A0M(boolean z) {
        if (this.A0Z != z) {
            this.A0Z = z;
            AnonymousClass8BV.A19(this);
        }
    }

    public final void A0N(boolean z) {
        if (this.A0U != z) {
            this.A0U = z;
            B4G b4g = this.A09;
            if (b4g != null) {
                C161808Hv r0 = (C161808Hv) b4g;
                Handler handler = r0.A00;
                Runnable runnable = r0.A02;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
    }

    public boolean A0O() {
        if (!this.A0Z || !this.A0N || !this.A0Q) {
            return false;
        }
        return true;
    }

    public boolean A0P() {
        boolean A0O2;
        if (this instanceof TwoStatePreference) {
            TwoStatePreference twoStatePreference = (TwoStatePreference) this;
            boolean z = twoStatePreference.A03;
            boolean z2 = twoStatePreference.A02;
            if (!z ? z2 : !z2) {
                A0O2 = twoStatePreference.A0O();
            }
            return true;
        } else if (!(this instanceof EditTextPreference)) {
            return !A0O();
        } else {
            EditTextPreference editTextPreference = (EditTextPreference) this;
            if (!TextUtils.isEmpty(editTextPreference.A00)) {
                A0O2 = editTextPreference.A0O();
            }
            return true;
        }
        if (!A0O2) {
            return true;
        }
        return false;
    }

    public boolean A0Q() {
        if (this.A0E == null || !this.A0R || !AnonymousClass8BR.A1S(this.A0J)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0F;
        CharSequence charSequence2 = preference.A0F;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0F.toString());
    }

    private void A02(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    A02(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    public void A0D(View view) {
        String str;
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        Intent intent;
        B6Y b6y;
        if (A0O() && this.A0T) {
            if (this instanceof TwoStatePreference) {
                TwoStatePreference twoStatePreference = (TwoStatePreference) this;
                boolean z = !twoStatePreference.A02;
                Boolean valueOf = Boolean.valueOf(z);
                B6V b6v = twoStatePreference.A0A;
                if (b6v != null) {
                    b6v.C1R(twoStatePreference, valueOf);
                }
                twoStatePreference.A0S(z);
            } else if (this instanceof PreferenceScreen) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) this;
                if (preferenceGroup.A06 == null && preferenceGroup.A0I == null) {
                    preferenceGroup.A01.size();
                }
            } else if (this instanceof DialogPreference) {
                DialogPreference dialogPreference = (DialogPreference) this;
                if (dialogPreference instanceof AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1) {
                    AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment = ((AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1) dialogPreference).A01;
                    AnonymousClass1FL A1B = advancedNotificationSettingsFragment.A1B();
                    if (A1B != null) {
                        AnonymousClass4Yv.A01(A1B, 0);
                        AdvancedNotificationSettingsFragment.A01(advancedNotificationSettingsFragment, "jid_message_popup");
                    }
                } else if (dialogPreference instanceof C161608Gm) {
                    AnonymousClass4Yv.A01(((C161608Gm) dialogPreference).A01.A00, 0);
                } else if (dialogPreference instanceof DropDownPreference) {
                    ((DropDownPreference) dialogPreference).A00.performClick();
                } else {
                    B4H b4h = dialogPreference.A0E.A03;
                    if (b4h != null) {
                        Fragment fragment = (Fragment) b4h;
                        if (fragment.A1F().A0Q("androidx.preference.PreferenceFragment.DIALOG") == null) {
                            if (dialogPreference instanceof EditTextPreference) {
                                str = dialogPreference.A0J;
                                multiSelectListPreferenceDialogFragmentCompat = new DialogFragment();
                            } else if (dialogPreference instanceof ListPreference) {
                                str = dialogPreference.A0J;
                                multiSelectListPreferenceDialogFragmentCompat = new DialogFragment();
                            } else if (dialogPreference instanceof MultiSelectListPreference) {
                                str = dialogPreference.A0J;
                                multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                            } else {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("Cannot display dialog for an unknown Preference type: ");
                                C17900vP.A0a(dialogPreference, A10);
                                throw AnonymousClass001.A12(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.", A10);
                            }
                            Bundle bundle = new Bundle(1);
                            bundle.putString("key", str);
                            multiSelectListPreferenceDialogFragmentCompat.A1R(bundle);
                            multiSelectListPreferenceDialogFragmentCompat.A1V(fragment, 0);
                            multiSelectListPreferenceDialogFragmentCompat.A2C(fragment.A1F(), "androidx.preference.PreferenceFragment.DIALOG");
                        }
                    }
                }
            }
            B6W b6w = this.A0B;
            if (b6w != null) {
                b6w.C1S();
                return;
            }
            C195659th r0 = this.A0E;
            if ((r0 == null || (b6y = r0.A05) == null || !b6y.C1T(this)) && (intent = this.A06) != null) {
                this.A05.startActivity(intent);
            }
        }
    }

    public void A0K(String str) {
        if (A0Q()) {
            String str2 = null;
            if (A0Q()) {
                str2 = this.A0E.A01().getString(this.A0J, (String) null);
            }
            if (!TextUtils.equals(str, str2)) {
                SharedPreferences.Editor A002 = this.A0E.A00();
                A002.putString(this.A0J, str);
                if (!this.A0E.A08) {
                    A002.apply();
                }
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        CharSequence charSequence = this.A0F;
        if (!TextUtils.isEmpty(charSequence)) {
            A10.append(charSequence);
            A10.append(' ');
        }
        CharSequence A042 = A04();
        if (!TextUtils.isEmpty(A042)) {
            A10.append(A042);
            A10.append(' ');
        }
        if (A10.length() > 0) {
            A10.setLength(A10.length() - 1);
        }
        return A10.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00f9, code lost:
        if (r6.hasValue(11) != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
            r8 = this;
            r8.<init>()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r8.A02 = r2
            r5 = 1
            r8.A0Z = r5
            r8.A0T = r5
            r8.A0R = r5
            r8.A0N = r5
            r8.A0Q = r5
            r8.A0U = r5
            r8.A0X = r5
            r8.A0Y = r5
            r8.A0c = r5
            r8.A0b = r5
            r0 = 2131626518(0x7f0e0a16, float:1.8880274E38)
            r8.A01 = r0
            r4 = 0
            X.AFE r0 = new X.AFE
            r0.<init>(r8, r4)
            r8.A0d = r0
            r8.A05 = r9
            int[] r0 = X.AnonymousClass9UH.A06
            android.content.res.TypedArray r6 = r9.obtainStyledAttributes(r10, r0, r11, r12)
            r1 = 23
            int r0 = r6.getResourceId(r4, r4)
            int r0 = r6.getResourceId(r1, r0)
            r8.A00 = r0
            r1 = 26
            r0 = 6
            java.lang.String r0 = X.AnonymousClass8BW.A0b(r6, r1, r0)
            r8.A0J = r0
            r0 = 34
            r1 = 4
            java.lang.CharSequence r0 = r6.getText(r0)
            if (r0 != 0) goto L_0x0054
            java.lang.CharSequence r0 = r6.getText(r1)
        L_0x0054:
            r8.A0F = r0
            r0 = 33
            r1 = 7
            java.lang.CharSequence r0 = r6.getText(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.CharSequence r0 = r6.getText(r1)
        L_0x0063:
            r8.A0W = r0
            r1 = 28
            r0 = 8
            int r0 = r6.getInt(r0, r2)
            int r0 = r6.getInt(r1, r0)
            r8.A02 = r0
            r1 = 22
            r0 = 13
            java.lang.String r0 = X.AnonymousClass8BW.A0b(r6, r1, r0)
            r8.A0I = r0
            r2 = 27
            r1 = 3
            r0 = 2131626518(0x7f0e0a16, float:1.8880274E38)
            int r0 = r6.getResourceId(r1, r0)
            int r0 = r6.getResourceId(r2, r0)
            r8.A01 = r0
            r1 = 35
            r0 = 9
            int r0 = r6.getResourceId(r0, r4)
            int r0 = r6.getResourceId(r1, r0)
            r8.A03 = r0
            r1 = 21
            r0 = 2
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Z = r0
            r1 = 30
            r0 = 5
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0T = r0
            r1 = 29
            boolean r0 = r6.getBoolean(r5, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0R = r0
            r1 = 19
            r0 = 10
            java.lang.String r0 = X.AnonymousClass8BW.A0b(r6, r1, r0)
            r8.A0H = r0
            boolean r0 = r8.A0T
            r1 = 16
            boolean r0 = r6.getBoolean(r1, r0)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0X = r0
            boolean r0 = r8.A0T
            r1 = 17
            boolean r0 = r6.getBoolean(r1, r0)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Y = r0
            r0 = 18
            r1 = 18
            boolean r0 = r6.hasValue(r0)
            if (r0 != 0) goto L_0x00fb
            r0 = 11
            r1 = 11
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x0109
        L_0x00fb:
            boolean r0 = r8 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0159
            boolean r0 = r6.getBoolean(r1, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0107:
            r8.A0G = r7
        L_0x0109:
            r1 = 31
            r0 = 12
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0b = r0
            r0 = 32
            boolean r0 = r6.hasValue(r0)
            r8.A0a = r0
            if (r0 == 0) goto L_0x012f
            r1 = 32
            r0 = 14
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0c = r0
        L_0x012f:
            r1 = 24
            r0 = 15
            boolean r0 = r6.getBoolean(r0, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0P = r0
            r1 = 25
            boolean r0 = r6.getBoolean(r1, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0U = r0
            r1 = 20
            boolean r0 = r6.getBoolean(r1, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0M = r0
            r6.recycle()
            return
        L_0x0159:
            boolean r0 = r8 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x0166
            int r0 = r6.getInt(r1, r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x0107
        L_0x0166:
            boolean r0 = r8 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0182
            java.lang.CharSequence[] r3 = r6.getTextArray(r1)
            java.util.HashSet r7 = X.C17880vN.A12()
            int r2 = r3.length
            r1 = 0
        L_0x0174:
            if (r1 >= r2) goto L_0x0107
            r0 = r3[r1]
            java.lang.String r0 = r0.toString()
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x0174
        L_0x0182:
            boolean r0 = r8 instanceof androidx.preference.ListPreference
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8 instanceof androidx.preference.EditTextPreference
            if (r0 != 0) goto L_0x018d
            r7 = 0
            goto L_0x0107
        L_0x018d:
            java.lang.String r7 = r6.getString(r1)
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C63882tq.A01(context, 2130970806, 16842894));
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }
}
