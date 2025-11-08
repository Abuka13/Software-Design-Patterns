interface CharacterVisitor {
    void visit(Weapon weapon);
    void visit(Armor armor);
    void visit(Skill skill);
    void visit(GameCharacter character);
}
class CharacterPowerVisitor implements  CharacterVisitor {
    private int totalPower = 0;
    public void visit(Weapon weapon) {
        totalPower+=30;
    }
    public void visit(Armor armor) {
        totalPower+=20;
    }
    public void visit(Skill skill) {
        totalPower+=50;
    }
    public void visit(GameCharacter character) {
        System.out.println("Total Power: " + totalPower);
    }

}
