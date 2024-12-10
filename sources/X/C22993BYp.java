package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.BYp  reason: case insensitive filesystem */
public abstract class C22993BYp extends C24429C3e {
    @Deprecated
    public EDS A00(Context context, Looper looper, EDW edw, EDX edx, CTL ctl, Object obj) {
        Object obj2 = obj;
        Context context2 = context;
        Looper looper2 = looper;
        EDW edw2 = edw;
        EDX edx2 = edx;
        CTL ctl2 = ctl;
        if (this instanceof C22992BYo) {
            return new C23020BZw(context2, looper2, edw2, edx2, ctl2);
        }
        if (this instanceof C22991BYn) {
            throw null;
        } else if (this instanceof C22990BYm) {
            return new C23022BZy(context2, C23022BZy.A00(ctl2), looper2, edw2, edx2, ctl2);
        } else {
            if (this instanceof C22989BYl) {
                return new C23015BZr(context2, looper2, edw2, edx2, ctl2);
            }
            if (this instanceof C22988BYk) {
                C23019BZv bZv = new C23019BZv(context2, looper2, edw2, edx2, ctl2);
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (Log.isLoggable("NearbyMessagesClient", 2)) {
                        Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
                    }
                    activity.getApplication().registerActivityLifecycleCallbacks(new C26328Cxl(activity, bZv));
                }
                return bZv;
            } else if (this instanceof C22987BYj) {
                return new C23018BZu(context2, looper2, edw2, edx2, ctl2);
            } else {
                if (this instanceof C22986BYi) {
                    return new C23023BZz(context2, looper2, edw2, edx2, ctl2, 69);
                }
                if (this instanceof C22985BYh) {
                    C23021BZx bZx = new C23021BZx(context2, looper2, edw2, edx2, ctl2);
                    bZx.A00 = BE6.A0O(bZx);
                    return bZx;
                } else if (this instanceof BYg) {
                    C23021BZx bZx2 = new C23021BZx(context2, looper2, edw2, edx2, ctl2);
                    bZx2.A00 = BE6.A0O(bZx2);
                    return bZx2;
                } else if (this instanceof C22984BYf) {
                    return new C23023BZz(context2, looper2, edw2, edx2, ctl2, 148);
                } else {
                    if (this instanceof BYZ) {
                        return new C23023BZz(context2, looper2, edw2, edx2, ctl2, 40);
                    }
                    if (this instanceof BYX) {
                        return new C23017BZt(context2, looper2, (GoogleSignInOptions) obj2, edw2, edx2, ctl2);
                    } else if (this instanceof BYW) {
                        return new C23013BZo(context2, looper2, (DI3) obj2, edw2, edx2, ctl2);
                    } else if (this instanceof BYU) {
                        return new C23014BZq(context2, looper2, (DI2) obj2, edw2, edx2, ctl2);
                    } else if (this instanceof C22983BYe) {
                        return new C23023BZz(context2, looper2, edw2, edx2, ctl2, 258);
                    } else {
                        if (this instanceof BYd) {
                            return new C23023BZz(context2, looper2, edw2, edx2, ctl2, 224);
                        }
                        if (this instanceof C22982BYc) {
                            return new C23012BZn(context2, looper2, edw2, edx2, ctl2);
                        }
                        if (this instanceof C22981BYb) {
                            return new BZp(context2, looper2, edw2, edx2, ctl2);
                        }
                        if (this instanceof C22980BYa) {
                            return new BZm(context2, looper2, edw2, edx2, ctl2, (C26891DHy) obj2);
                        }
                        if (this instanceof BYY) {
                            return new C23016BZs(context2, looper2, (DI1) obj2, edw2, edx2, ctl2);
                        }
                        if (this instanceof BYV) {
                            return new C23023BZz(context2, looper2, edw2, edx2, ctl2, 126);
                        }
                        throw BE6.A0v("buildClient must be implemented");
                    }
                }
            }
        }
    }
}
