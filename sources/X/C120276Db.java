package X;

/* renamed from: X.6Db  reason: invalid class name and case insensitive filesystem */
public final class C120276Db extends AnonymousClass6SO {
    public final boolean hasAvatarConfigCached;
    public final boolean hasAvatarStickerPackInstalled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C120276Db) {
                C120276Db r5 = (C120276Db) obj;
                if (!(this.hasAvatarConfigCached == r5.hasAvatarConfigCached && this.hasAvatarStickerPackInstalled == r5.hasAvatarStickerPackInstalled)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.hasAvatarConfigCached), this.hasAvatarStickerPackInstalled);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120276Db(boolean r3, boolean r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No Avatar (has config cached: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", has pack installed: "
            r1.append(r0)
            java.lang.String r0 = X.C17900vP.A0F(r1, r4)
            r2.<init>(r0)
            r2.hasAvatarConfigCached = r3
            r2.hasAvatarStickerPackInstalled = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120276Db.<init>(boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoAvatar(hasAvatarConfigCached=");
        A10.append(this.hasAvatarConfigCached);
        A10.append(", hasAvatarStickerPackInstalled=");
        return C17900vP.A0F(A10, this.hasAvatarStickerPackInstalled);
    }
}
