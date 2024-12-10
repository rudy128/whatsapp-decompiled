package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;

/* renamed from: X.0yN  reason: invalid class name and case insensitive filesystem */
public final class C19540yN extends C19530yM {
    public final /* synthetic */ C19500yJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19540yN(Looper looper, C19500yJ r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        Bundle bundle;
        String str4;
        C19500yJ r4 = this.A00;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new AnonymousClass2QZ());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof D3G) {
                        r4.A01 = (D3G) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        r4.A00 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                boolean z = true;
                if (action != "com.google.android.c2dm.intent.REGISTRATION" && (action == null || !action.equals("com.google.android.c2dm.intent.REGISTRATION"))) {
                    z = false;
                }
                if (z) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            str = "Rpc";
                            str2 = "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras())));
                        } else {
                            str = "Rpc";
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Received InstanceID error ".concat(stringExtra2));
                            }
                            if (stringExtra2.startsWith("|")) {
                                String[] split = stringExtra2.split("\\|");
                                if (split.length <= 2 || ((str4 = split[1]) != "ID" && (str4 == null || !str4.equals("ID")))) {
                                    str2 = "Unexpected structured response ".concat(stringExtra2);
                                } else {
                                    str3 = split[2];
                                    String str5 = split[3];
                                    if (str5.startsWith(":")) {
                                        str5 = str5.substring(1);
                                    }
                                    bundle = intent2.putExtra("error", str5).getExtras();
                                }
                            } else {
                                AnonymousClass00O r3 = r4.A03;
                                synchronized (r3) {
                                    for (int i = 0; i < r3.size(); i++) {
                                        C19500yJ.A01(intent2.getExtras(), r4, (String) r3.A04(i));
                                    }
                                }
                                return;
                            }
                        }
                        Log.w(str, str2);
                    }
                    Matcher matcher = C19500yJ.A0A.matcher(stringExtra);
                    if (matcher.matches()) {
                        str3 = matcher.group(1);
                        String group = matcher.group(2);
                        if (str3 != null) {
                            bundle = intent2.getExtras();
                            bundle.putString("registration_id", group);
                        } else {
                            return;
                        }
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    } else {
                        return;
                    }
                    C19500yJ.A01(bundle, r4, str3);
                    return;
                } else if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                    return;
                } else {
                    return;
                }
            }
        }
        str = "Rpc";
        str2 = "Dropping invalid message";
        Log.w(str, str2);
    }
}
