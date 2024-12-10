package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Rm  reason: invalid class name and case insensitive filesystem */
public class C26271Rm {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11C A02;
    public final C19830z4 A03;
    public final C18000vb A04;
    public final C18010vc A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C18030ve A0A;

    private Account A00(AccountManager accountManager, Context context) {
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        if (r0.A0E == null) {
            Log.e("androidcontactssync/get-or-create-account null jid");
            return null;
        }
        Account account = new Account(context.getString(2131898700), "com.whatsapp");
        try {
            if (accountManager.addAccountExplicitly(account, (String) null, (Bundle) null)) {
                ContentResolver.setIsSyncable(account, "com.android.contacts", 1);
                return account;
            }
            Log.e("androidcontactssync/get-or-create-account failed to add account");
            return null;
        } catch (SecurityException e) {
            Log.e("androidcontactssync/createAccount/get-or-create-account failed to add account", e);
            return null;
        }
    }

    public static synchronized void A01(Account account, Context context, C26271Rm r23) {
        C26271Rm r3 = r23;
        synchronized (r3) {
            Account account2 = account;
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", account2.name).appendQueryParameter("account_type", account2.type).appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri build2 = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            ArrayList arrayList = new ArrayList();
            AnonymousClass11C r6 = r3.A02;
            Cursor A032 = r6.A0O().A03(build, new String[]{"_id", "sync1", "sync2", "display_name"}, (String) null, (String[]) null, (String) null);
            if (A032 != null) {
                try {
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("sync1");
                    int columnIndexOrThrow3 = A032.getColumnIndexOrThrow("display_name");
                    while (A032.moveToNext()) {
                        UserJid A042 = UserJid.Companion.A04(A032.getString(columnIndexOrThrow2));
                        if (A042 != null) {
                            arrayList.add(new C57422j3(A042, A032.getString(columnIndexOrThrow3), A032.getLong(columnIndexOrThrow)));
                        }
                    }
                    A032.close();
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C57422j3 r8 = (C57422j3) it.next();
                if (arrayList2.size() >= 100) {
                    A04(r6.A0O(), "error updating contact data action strings", arrayList2);
                }
                String A0G = r3.A04.A0G(AnonymousClass17K.A01(C42771yi.A00(), r8.A01.user));
                String valueOf = String.valueOf(r8.A00);
                Context context2 = context;
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.profile"}).withValue("data3", context2.getString(2131886401, new Object[]{A0G})).withYieldAllowed(true).build());
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"}).withValue("data3", context2.getString(2131886403, new Object[]{A0G})).build());
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.video.call"}).withValue("data3", context2.getString(2131886402, new Object[]{A0G})).build());
            }
            if (!arrayList2.isEmpty()) {
                A04(r6.A0O(), "error updating contact data action strings", arrayList2);
            }
        }
        return;
        throw th;
    }

    public static boolean A02(C26271Rm r2, AnonymousClass1E7 r3) {
        if (!C18020vd.A05(C18040vf.A02, r2.A0A, 8434)) {
            return true;
        }
        if (C42701yb.A01(r3.A0J)) {
            return false;
        }
        return r3.A0q;
    }

    public static boolean A03(AnonymousClass1E7 r5) {
        C59042lf r0;
        if (r5 == null || (r0 = r5.A0H) == null || r0.A00 == -5 || !r5.A10 || r5.A0F() || C22971Dz.A0N(r5.A0J) || (r5.A0J instanceof C173458v6)) {
            return false;
        }
        return true;
    }

    public static boolean A04(AnonymousClass11B r2, String str, ArrayList arrayList) {
        try {
            C18070vi.A0X(AnonymousClass11B.A00(r2).applyBatch("com.android.contacts", arrayList));
            arrayList.clear();
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidcontactssync/");
            sb.append(str);
            Log.e(sb.toString(), e);
            arrayList.clear();
            return false;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public Account A05(Context context) {
        Account account;
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType("com.whatsapp");
        if (accountsByType.length == 0) {
            account = A00(accountManager, context);
            if (account == null) {
                return null;
            }
        } else {
            account = accountsByType[0];
            if (!TextUtils.equals(context.getString(2131898700), account.name)) {
                accountManager.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
                account = A00(accountManager, context);
                if (account == null) {
                    return null;
                }
            }
        }
        try {
            if (!ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
            }
            ContentResolver.addPeriodicSync(account, "com.android.contacts", new Bundle(), 3600);
            return account;
        } catch (NullPointerException e) {
            if (e.getMessage() != null && e.getMessage().startsWith("Attempt to invoke virtual method 'com.prism.gaia")) {
                return account;
            }
            throw e;
        }
    }

    public C26271Rm(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass11C r3, C19830z4 r4, C18000vb r5, C18030ve r6, C18010vc r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A0A = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r9;
        this.A03 = r4;
        this.A09 = r10;
        this.A05 = r7;
        this.A08 = r11;
    }
}
