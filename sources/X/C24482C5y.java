package X;

/* renamed from: X.C5y  reason: case insensitive filesystem */
public abstract class C24482C5y {
    public E7L A00;
    public C26262Cw7 A01;

    public String A00() {
        if (this instanceof BNL) {
            return "radialGradient";
        }
        if (this instanceof BNK) {
            return "linearGradient";
        }
        if (this instanceof C22743BNg) {
            return "stop";
        }
        if (this instanceof C22742BNf) {
            return "solidColor";
        }
        if (this instanceof C22758BNv) {
            return "textPath";
        }
        if (this instanceof C22759BNw) {
            return "text";
        }
        if (this instanceof C22760BNx) {
            return "tspan";
        }
        if (this instanceof C22757BNu) {
            return "tref";
        }
        if (this instanceof C22737BNa) {
            return "mask";
        }
        if (this instanceof C22755BNs) {
            return "view";
        }
        if (this instanceof C22754BNr) {
            return "symbol";
        }
        if (this instanceof C22749BNm) {
            return "svg";
        }
        if (this instanceof C22751BNo) {
            return "pattern";
        }
        if (this instanceof C22750BNn) {
            return "marker";
        }
        if (this instanceof C22753BNq) {
            return "image";
        }
        if (this instanceof BNZ) {
            BNZ bnz = (BNZ) this;
            if (bnz instanceof BNS) {
                return "use";
            }
            if (bnz instanceof BNR) {
                return "switch";
            }
            if (bnz instanceof BNT) {
                return "defs";
            }
            if (bnz instanceof BNU) {
                return "clipPath";
            }
            return "group";
        } else if (this instanceof BNQ) {
            return "rect";
        } else {
            if (this instanceof BNW) {
                if (((BNW) this) instanceof BNV) {
                    return "polygon";
                }
                return "polyline";
            } else if (this instanceof BNM) {
                return "path";
            } else {
                if (this instanceof BNP) {
                    return "line";
                }
                if (this instanceof BNO) {
                    return "ellipse";
                }
                if (this instanceof BNN) {
                    return "circle";
                }
                return "";
            }
        }
    }
}
