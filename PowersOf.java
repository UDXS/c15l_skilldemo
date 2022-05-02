class PowersOf {
    int base;
    PowersOf(int base) {
        this.base = base;
    }

    int[] powersUntil (int exp) {
        int[] pows = new int[exp];
        pows[0] = 0; // Should be wrong 
        for(int i = 1; i < exp; i++) {
            pows[i] = pows[i - 1] * this.base;
        }

        return pows;        
    }
    int powerAt (int exp) {
        return powersUntil(exp)[exp - 1];
    }
}