package X;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: X.1Bn  reason: invalid class name */
public class AnonymousClass1Bn extends BasicPermission {
    public final String actions;
    public final int permissionMask;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass1Bn)) {
                return false;
            }
            AnonymousClass1Bn r4 = (AnonymousClass1Bn) obj;
            if (this.permissionMask != r4.permissionMask || !getName().equals(r4.getName())) {
                return false;
            }
        }
        return true;
    }

    public String getActions() {
        return this.actions;
    }

    public int hashCode() {
        return getName().hashCode() + this.permissionMask;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof AnonymousClass1Bn) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.permissionMask;
        int i2 = ((AnonymousClass1Bn) permission).permissionMask;
        return (i & i2) == i2;
    }

    public AnonymousClass1Bn(String str) {
        super("SC", str);
        this.actions = str;
        StringTokenizer stringTokenizer = new StringTokenizer(AnonymousClass1Bo.A00(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.permissionMask = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }
}
