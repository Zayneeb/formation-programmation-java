package fr.lteconsulting;

public class TestPlateau
{
	public static void main( String[] args )
	{
		testPuissance4();
		// testJeuBidon();
		// testSaisie();
		// testDames();
		// testDeBase();
	}

	private static void testPuissance4()
	{
		Puissance4 jeu = new Puissance4();
		jeu.jouer();
	}

	private static void testJeuBidon()
	{
		JeuBidon jeu = new JeuBidon();
		jeu.jouer();
	}

	private static void testSaisie()
	{
		Plateau plateau = new Plateau( 15, 15 );

		int nb = 10;

		while( nb-- > 0 )
		{
			String couleur = Saisie.saisie( "couleur ? (blanc/noir)" );
			int x = Saisie.saisieInt( "saisis l'abscisse" );
			int y = Saisie.saisieInt( "saisis l'ordonnée" );

			Piece piece = null;

			if( "noir".equals( couleur ) )
				piece = new Dame( CouleurNB.Noir );
			else
				piece = new Dame( CouleurNB.Blanc );

			plateau.placer( piece, new Coordonnee( x, y ) );

			plateau.afficher();
		}
	}

	private static void testDames()
	{
		int size = 20;
		Plateau plateau = new Plateau( size, size );

		for( int i = 0; i < size; i++ )
		{
			plateau.placer( new Dame( CouleurNB.Noir ), new Coordonnee( i, (1 + i) % 2 ) );
			plateau.placer( new Dame( CouleurNB.Noir ), new Coordonnee( i, 2 + (1 + i) % 2 ) );

			plateau.placer( new Dame( CouleurNB.Blanc ), new Coordonnee( i, size - 4 + (1 + i) % 2 ) );
			plateau.placer( new Dame( CouleurNB.Blanc ), new Coordonnee( i, size - 2 + (1 + i) % 2 ) );
		}

		plateau.afficher();
	}

	private static void testDeBase()
	{
		Plateau plateau = new Plateau( 10, 10 );

		plateau.afficher();

		plateau.placer( new Galet(), new Coordonnee( 1, 3 ) );

		plateau.afficher();
	}
}
