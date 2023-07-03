def stringUserInput():
    print("1 . Pecah Kata ")
    print("2 . Gabungkan kata ")
    print("3 . Pop Kata ")



def programList():
    isRunning = True

    while(isRunning):
        print("1 . GAME KATA ")
        print("2 . KELUAR")
        userChoiceInput = int(int(input("Pilihan anda : ")))

        if userChoiceInput == 1 :
            stringUserInput()
            s = int (input("Pilih  : "))
            if s == 1 :
                print("Game pecah kata ")
                
            elif s == 2 :
                print("Game gabungkan kata ")

            elif s== 3 :
                print("Game pop kata ")

        elif userChoiceInput == 2 :
            print("Keluar ")
            break

        elif  userChoiceInput  > 2 :
            print("Input yang benar ")

programList()        