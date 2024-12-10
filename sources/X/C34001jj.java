package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.1jj  reason: invalid class name and case insensitive filesystem */
public final class C34001jj implements C33981jh, C33991ji {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final AnonymousClass1GY A0J;
    public final AnonymousClass1GP A0K;
    public final ClassLoader A0L;

    public void A01() {
        A00(false);
    }

    public void A02() {
        A00(true);
    }

    public void A08(Fragment fragment, int i) {
        A0E(fragment, (String) null, i, 1);
    }

    public void A09(Fragment fragment, int i) {
        A0D(fragment, (String) null, i);
    }

    public void A0B(Fragment fragment, String str) {
        A0E(fragment, str, 0, 1);
    }

    public void A0C(Fragment fragment, String str, int i) {
        A0E(fragment, str, i, 1);
    }

    public boolean BLr(ArrayList arrayList, ArrayList arrayList2) {
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.A0F) {
            return true;
        }
        this.A0K.A0D.add(this);
        return true;
    }

    public int A00(boolean z) {
        int i;
        if (!this.A0I) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new AnonymousClass2QX());
                A0G(printWriter, "  ", true);
                printWriter.close();
            }
            this.A0I = true;
            if (this.A0F) {
                i = this.A0K.A0a.getAndIncrement();
            } else {
                i = -1;
            }
            this.A07 = i;
            this.A0K.A0r(this, z);
            return this.A07;
        }
        throw new IllegalStateException("commit already called");
    }

    public void A03() {
        if (!this.A0F) {
            this.A0H = false;
            this.A0K.A0s(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A04() {
        if (!this.A0F) {
            this.A0H = false;
            this.A0K.A0s(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A05(int i) {
        if (this.A0F) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            ArrayList arrayList = this.A0C;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C34271kD r6 = (C34271kD) arrayList.get(i2);
                Fragment fragment = r6.A05;
                if (fragment != null) {
                    fragment.A00 += i;
                    if (AnonymousClass1GP.A0G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(r6.A05);
                        sb2.append(" to ");
                        sb2.append(r6.A05.A00);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    public void A06(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A05 = i4;
    }

    public void A07(Fragment fragment) {
        AnonymousClass1GP r1 = fragment.A0I;
        if (r1 == null || r1 == this.A0K) {
            A0F(new C34271kD(fragment, 3));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.1kD, java.lang.Object] */
    public void A0A(Fragment fragment, C23401Fx r5) {
        AnonymousClass1GP r0 = fragment.A0I;
        AnonymousClass1GP r2 = this.A0K;
        if (r0 == r2) {
            ? obj = new Object();
            obj.A00 = 10;
            obj.A05 = fragment;
            obj.A08 = false;
            obj.A07 = fragment.A0K;
            obj.A06 = r5;
            A0F(obj);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        sb.append(r2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0D(Fragment fragment, String str, int i) {
        if (i != 0) {
            A0E(fragment, str, i, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void A0E(Fragment fragment, String str, int i, int i2) {
        String str2 = fragment.A0S;
        if (str2 != null) {
            C34281kE.A01(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            String str3 = fragment.A0T;
            if (str3 == null || str.equals(str3)) {
                fragment.A0T = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.A0T);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.A03;
                if (i3 == 0 || i3 == i) {
                    fragment.A03 = i;
                    fragment.A01 = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(": was ");
                    sb3.append(fragment.A03);
                    sb3.append(" now ");
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        A0F(new C34271kD(fragment, i2));
        fragment.A0I = this.A0K;
    }

    public void A0F(C34271kD r2) {
        this.A0C.add(r2);
        r2.A01 = this.A02;
        r2.A02 = this.A03;
        r2.A03 = this.A04;
        r2.A04 = this.A05;
    }

    public void A0G(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A0A);
            printWriter.print(" mIndex=");
            printWriter.print(this.A07);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A0I);
            if (this.A06 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A06));
            }
            if (!(this.A02 == 0 && this.A03 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A02));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (!(this.A04 == 0 && this.A05 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A04));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (!(this.A01 == 0 && this.A09 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.A01));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A09);
            }
            if (!(this.A00 == 0 && this.A08 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.A00));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A08);
            }
        }
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C34271kD r4 = (C34271kD) arrayList.get(i);
                int i2 = r4.A00;
                switch (i2) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(i2);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r4.A05);
                if (z) {
                    if (!(r4.A01 == 0 && r4.A02 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A02));
                    }
                    if (r4.A03 != 0 || r4.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A04));
                    }
                }
            }
        }
    }

    public void A0H(String str) {
        if (this.A0H) {
            this.A0F = true;
            this.A0A = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i = this.A07;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A0A;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }

    public C34001jj(AnonymousClass1GP r4) {
        ClassLoader classLoader;
        AnonymousClass1GY A0R = r4.A0R();
        AnonymousClass1GO r0 = r4.A08;
        if (r0 != null) {
            classLoader = r0.A01.getClassLoader();
        } else {
            classLoader = null;
        }
        this.A0C = new ArrayList();
        this.A0H = true;
        this.A0G = false;
        this.A0J = A0R;
        this.A0L = classLoader;
        this.A07 = -1;
        this.A0K = r4;
    }
}
