package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class A57 {
    public static A57 A05;
    public static final Object A06 = C17880vN.A0p();
    public final Context A00;
    public final ArrayList A01 = AnonymousClass000.A13();
    public final HashMap A02 = C17880vN.A11();
    public final Handler A03;
    public final HashMap A04 = C17880vN.A11();

    public static A57 A00(Context context) {
        A57 a57;
        synchronized (A06) {
            a57 = A05;
            if (a57 == null) {
                a57 = new A57(context.getApplicationContext());
                A05 = a57;
            }
        }
        return a57;
    }

    public void A01(BroadcastReceiver broadcastReceiver) {
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C190869le r7 = (C190869le) arrayList.get(size);
                    r7.A01 = true;
                    for (int i = 0; i < r7.A03.countActions(); i++) {
                        String action = r7.A03.getAction(i);
                        HashMap hashMap2 = this.A04;
                        ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C190869le r1 = (C190869le) arrayList2.get(size2);
                                if (r1.A02 == broadcastReceiver) {
                                    r1.A01 = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                hashMap2.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A02(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C190869le r5 = new C190869le(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = C17880vN.A0z(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(r5);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = this.A04;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = C17880vN.A0z(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(r5);
            }
        }
    }

    public void A03(Intent intent) {
        String str;
        synchronized (this.A02) {
            Intent intent2 = intent;
            String action = intent2.getAction();
            String resolveTypeIfNeeded = intent2.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent2.getData();
            String scheme = intent2.getScheme();
            Set<String> categories = intent2.getCategories();
            boolean z = false;
            if ((intent2.getFlags() & 8) != 0) {
                z = true;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Resolving type ");
                A10.append(resolveTypeIfNeeded);
                A10.append(" scheme ");
                A10.append(scheme);
                Log.v("LocalBroadcastManager", AnonymousClass001.A1E(intent2, " of intent ", A10));
            }
            ArrayList arrayList = (ArrayList) this.A04.get(intent2.getAction());
            if (arrayList != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", AnonymousClass001.A1E(arrayList, "Action list: ", AnonymousClass000.A10()));
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    C190869le r4 = (C190869le) arrayList.get(i);
                    if (z) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Matching against filter ");
                        Log.v("LocalBroadcastManager", C17890vO.A0V(r4.A03, A102));
                    }
                    if (!r4.A00) {
                        String str2 = resolveTypeIfNeeded;
                        int match = r4.A03.match(action, str2, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                StringBuilder A103 = AnonymousClass000.A10();
                                A103.append("  Filter matched!  match=0x");
                                Log.v("LocalBroadcastManager", AnonymousClass000.A0y(Integer.toHexString(match), A103));
                            }
                            if (arrayList2 == null) {
                                arrayList2 = AnonymousClass000.A13();
                            }
                            arrayList2.add(r4);
                            r4.A00 = true;
                        } else if (z) {
                            if (match == -4) {
                                str = "category";
                            } else if (match == -3) {
                                str = "action";
                            } else if (match == -2) {
                                str = "data";
                            } else if (match != -1) {
                                str = "unknown reason";
                            } else {
                                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                            }
                            Log.v("LocalBroadcastManager", AnonymousClass001.A1H("  Filter did not match: ", str, AnonymousClass000.A10()));
                        }
                    } else if (z) {
                        Log.v("LocalBroadcastManager", "  Filter's target already added");
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C190869le) arrayList2.get(i2)).A00 = false;
                    }
                    this.A01.add(new AnonymousClass9ZQ(intent2, arrayList2));
                    Handler handler = this.A03;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public A57(Context context) {
        this.A00 = context;
        this.A03 = new C161268Cm(context.getMainLooper(), this, 0);
    }
}
