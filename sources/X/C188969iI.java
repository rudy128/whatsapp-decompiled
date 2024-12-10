package X;

/* renamed from: X.9iI  reason: invalid class name and case insensitive filesystem */
public final class C188969iI {
    public final boolean A00(C19830z4 r6) {
        C18070vi.A0d(r6, 0);
        if (C17890vO.A0B(r6).getInt("education_banner_count", 0) >= 3) {
            if (!r6.A2b("education_banner_timestamp", 604800000)) {
                return false;
            }
            r6.A1B(0);
        }
        return true;
    }
}
