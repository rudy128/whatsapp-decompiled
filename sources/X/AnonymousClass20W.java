package X;

/* renamed from: X.20W  reason: invalid class name */
public abstract class AnonymousClass20W {
    public static final Class A00(AnonymousClass20E r1) {
        C18070vi.A0d(r1, 0);
        Class BTa = ((AnonymousClass20D) r1).BTa();
        C18070vi.A0z(BTa, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return BTa;
    }

    public static final Class A01(AnonymousClass20E r2) {
        String name;
        C18070vi.A0d(r2, 0);
        Class BTa = ((AnonymousClass20D) r2).BTa();
        if (BTa.isPrimitive() && (name = BTa.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return BTa;
    }
}
