package X;

public final class BTR extends C3J {
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof BTR);
    }

    public int hashCode() {
        return 1748328242;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioFormat(codec=");
        A10.append("AAC");
        A10.append(", codecProfile=");
        A10.append("AAC_LC");
        A10.append(", sampleRate=");
        A10.append(48000);
        A10.append(", bitRate=");
        A10.append(96000);
        A10.append(", channelCount=");
        return AnonymousClass001.A1L(A10, 2);
    }
}
