package X;

import android.app.Application;
import android.content.SharedPreferences;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.labelitem.view.AddToListViewModel;
import com.whatsapp.twofactor.Fetch2FAEmailStatusJob;
import com.whatsapp.util.Log;

/* renamed from: X.3CA  reason: invalid class name */
public class AnonymousClass3CA implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3CA(Object obj, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
        this.A04 = str2;
    }

    public final void run() {
        Application application;
        String string;
        switch (this.A00) {
            case 0:
                String str = this.A03;
                int i = this.A01;
                String str2 = this.A04;
                ConversationsFragment conversationsFragment = ((C45822Bu) this.A02).A04;
                conversationsFragment.A0J.setProgress(i);
                conversationsFragment.A0w.setText(str2);
                conversationsFragment.A0L.setText(str);
                return;
            case 1:
                AnonymousClass1Vo.A01((AnonymousClass1Vo) this.A02, this.A03, this.A04, this.A01);
                return;
            case 2:
                AddToListViewModel addToListViewModel = (AddToListViewModel) this.A02;
                String str3 = this.A03;
                int i2 = this.A01;
                long A012 = ((C62522rX) addToListViewModel.A0G.get()).A01(str3, i2);
                if (A012 >= 0) {
                    addToListViewModel.A04.A0J(new AnonymousClass3C9(addToListViewModel, str3, i2, 1, A012));
                    return;
                }
                int i3 = (A012 > -2 ? 1 : (A012 == -2 ? 0 : -1));
                C41731wy r4 = addToListViewModel.A08;
                if (i3 == 0) {
                    application = addToListViewModel.A01;
                    string = application.getResources().getString(2131891732, new Object[]{str3});
                } else {
                    application = addToListViewModel.A01;
                    string = application.getResources().getString(2131891734);
                }
                r4.A0E(AnonymousClass1D6.A01(string, application.getResources().getString(2131899286)));
                return;
            default:
                C30901eh r3 = (C30901eh) this.A02;
                String str4 = this.A03;
                String str5 = this.A04;
                int i4 = this.A01;
                synchronized (r3) {
                    Log.i("TwoFactorAuthManager/storeAuthSettingsAsync");
                    if (str4 == null || str4.isEmpty()) {
                        r3.A03();
                    } else {
                        r3.A0F = str4;
                        C191309mN A013 = ((C22661Cs) r3.A09.get()).A01(C197569wu.A0Z, str4.getBytes(C19620yd.A0C));
                        String str6 = null;
                        if (A013 != null) {
                            String A002 = A013.A00();
                            if (A002 == null || !str4.equals(C30901eh.A01(r3, A002))) {
                                r3.A03.A0G("TwoFactorAuthManager/encryptCode/EncryptedCodeFailure", String.valueOf(AnonymousClass000.A1X(A002)), false);
                            } else {
                                str6 = A002;
                            }
                        }
                        boolean z = false;
                        if (str6 != null) {
                            z = true;
                            str4 = str6;
                        }
                        C17900vP.A0n("TwoFactorAuthManager/storeNewAuthSettings/isUsingEncryption: ", AnonymousClass000.A10(), z);
                        SharedPreferences.Editor putBoolean = C30901eh.A00(r3).edit().putString("two_factor_auth_code", str4).putBoolean("two_factor_auth_using_encryption", z).putLong("two_factor_auth_nag_time", System.currentTimeMillis()).putInt("two_factor_auth_nag_interval", i4).putBoolean("two_factor_auth_last_code_correctness", false);
                        if (str5 != null) {
                            int i5 = 2;
                            if (str5.length() > 0) {
                                i5 = 1;
                            }
                            putBoolean.putInt("two_factor_auth_email_set", i5);
                        } else if (C30901eh.A00(r3).getInt("two_factor_auth_email_set", 0) == 0) {
                            r3.A05.A01(new Fetch2FAEmailStatusJob());
                        }
                        putBoolean.apply();
                    }
                    r3.A04.A0J(new AnonymousClass7RC(r3, 29));
                }
                return;
        }
    }
}
