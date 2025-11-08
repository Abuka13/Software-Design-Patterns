interface Character {
    void accept(CharacterVisitor visitor);
}
class Weapon implements Character {
    public void accept(CharacterVisitor visitor) {
        visitor.visit(this);
    }
}
class Armor implements Character {
    public void accept(CharacterVisitor visitor) {
        visitor.visit(this);
    }
}
class Skill implements Character {
    public void accept(CharacterVisitor visitor) {
        visitor.visit(this);
    }
}
class GameCharacter implements Character {
    Character[] characters;
    public GameCharacter() {
        characters = new Character[] {
                new Weapon(),
                new Armor(),
                new Skill()
        };
    }
    public void accept(CharacterVisitor visitor) {
        for (Character character : characters) {
            character.accept(visitor);
        }
        visitor.visit(this);
    }
}